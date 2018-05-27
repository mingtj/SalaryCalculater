//package com.jm.hrhelper.db;
//
//
//import java.util.ArrayList;
//import java.util.List;
//
//
//import android.content.ContentValues;
//import android.content.Context;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.util.Log;
//
///**
// * 数据库操作类
// * 
// * 
// */
//public class DBManager {
//
//	private Context context;
//	private SQLiteDatabase database;
//
//	public DBManager(Context context) {
//		this.context = context;
//	}
//
//	/**
//	 * 打开数据库，如果不存在则创建一个数据库
//	 */
//	public void openDB() {
//		DBHelper dbHelper = new DBHelper(context);
//		if (database == null || !database.isOpen()) {
//			database = dbHelper.getWritableDatabase();
//		}
//	}
//
//	/**
//	 * 关闭数据库
//	 */
//	public void closeDB() {
//		if (database != null && database.isOpen()) {
//			database.close();
//		}
//	}
//
////	/**
////	 * 删除我的题库所有数据
////	 * 
////	 * @return
////	 */
////	public long deleteLibraryAllData() {
////		return database.delete(DBHelper.TABLE_NAME_TEST_LIBRARY, null,
////				null);
////	}
////	
////	/**
////	 * 添加一条我的错题数据
////	 * 
////	 * @param info
////	 * @return
////	 */
////	public long insertErrorQuestion(ErrorQuestionInfo info) {
////		ContentValues newValues = new ContentValues();
////
////		newValues.put(DBHelper.MY_ERROR_QUESTION_NAME, info.getQuestionName());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_TYPE, info.getQuestionType());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_ANSWER, info.getQuestionAnswer());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_SELECTED, info.getQuestionSelect());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_ISRIGHT, info.getIsRight());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_ANALYSIS, info.getAnalysis());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_OPTION_A, info.getOptionA());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_OPTION_B, info.getOptionB());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_OPTION_C, info.getOptionC());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_OPTION_D, info.getOptionD());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_OPTION_E, info.getOptionE());
////		newValues.put(DBHelper.MY_ERROR_QUESTION_OPTION_TYPE, info.getOptionType());
////
////		return database.insert(DBHelper.TABLE_NAME_MY_ERROR_QUESTION, null,
////				newValues);
////	}
////
////	/**
////	 * 删除我的错题所有数据
////	 * 
////	 * @return
////	 */
////	public long deleteAllData() {
////		return database.delete(DBHelper.TABLE_NAME_MY_ERROR_QUESTION, null,
////				null);
////	}
////
////	/**
////	 * 查询全部我的错题数据
////	 * 
////	 * @return
////	 */
////	public ErrorQuestionInfo[] queryAllData() {
////		Cursor result = database.query(DBHelper.TABLE_NAME_MY_ERROR_QUESTION,
////				null, null, null, null,
////				null, null);
////		return ConvertToQuestion(result);
////	}
////
////	/**
////	 * ConvertToPeople(Cursor cursor)是私有函数， 作用是将查询结果转换为用来存储数据自定义的People类对象
////	 * People类的包含四个公共属性，分别为ID、Name、Age和Height，对应数据库中的四个属性值
////	 */
////	private ErrorQuestionInfo[] ConvertToQuestion(Cursor cursor) {
////		int resultCounts = cursor.getCount();
////		if (resultCounts == 0 || !cursor.moveToFirst()) {
////			return null;
////		}
////		ErrorQuestionInfo[] peoples = new ErrorQuestionInfo[resultCounts];
////		for (int i = 0; i < resultCounts; i++) {
////			peoples[i] = new ErrorQuestionInfo();
////			peoples[i].questionId = cursor.getInt(0);
////			peoples[i].questionName = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_NAME));
////			peoples[i].questionType = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_TYPE));
////			peoples[i].questionAnswer = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_ANSWER));
////			peoples[i].questionSelect = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_SELECTED));
////			peoples[i].isRight = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_ISRIGHT));
////			peoples[i].Analysis = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_ANALYSIS));
////			peoples[i].optionA = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_OPTION_A));
////			peoples[i].optionB = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_OPTION_B));
////			peoples[i].optionC = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_OPTION_C));
////			peoples[i].optionD = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_OPTION_D));
////			peoples[i].optionE = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_OPTION_E));
////			peoples[i].optionType = cursor.getString(cursor
////					.getColumnIndex(DBHelper.MY_ERROR_QUESTION_OPTION_TYPE));
////			cursor.moveToNext();
////		}
////		return peoples;
////	}
////	
//	
//	//＝＝＝＝＝＝＝＝＝＝＝favExam =========start=========
//	/** 
//     * query all FavQuestionInfo, return list 
//     * @return List<FavQuestionInfo> 
//     */  
//	public List<FavQuestionInfo> queryFavByPage(int page,int pageSize){
//		List<FavQuestionInfo> list = new ArrayList<FavQuestionInfo>();  
////        Cursor cursor = queryTheCursor();  //查询所有时用
//           Cursor cursor = queryTheCursorByPage(page,pageSize);//分页查询
//        while (cursor.moveToNext()) {  
//        	FavQuestionInfo info = new FavQuestionInfo();  
//        	info.setCourseId(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_COURSE_ID)));
//        	info.setQuestionId(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ID)));
//        	info.setQuestionName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_NAME)));
//        	info.setQuestionType(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_TYPE)));
//        	info.setQuestionAnswer(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ANSWER)));
//        	info.setAnalysis(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ANALYSIS)));
//        	info.setMaterial(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL)));
//        	info.setMaterialImg(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL_IMG)));
//        	info.setChapterName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_CHAPTER_NAME)));
//        	info.setPaperName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_PAPER_NAME)));
//        	info.setOptionA(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_A)));
//        	info.setOptionB(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_B)));
//        	info.setOptionC(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_C)));
//        	info.setOptionD(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_D)));
//        	info.setOptionE(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_E)));
//        	info.setScore(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_SCORE)));
//        	info.setDifficulty(cursor.getInt(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_DIFFICULTY)));
//        	info.setK1(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K1)));
//        	info.setK2(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K2)));
//        	info.setK3(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K3)));
//        	info.setMaterialImgs(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL_IMGS)));
//            list.add(info);  
//        }  
//        return list;  
//	}
//	
//	public int queryAllFav(){
//		List<FavQuestionInfo> list = new ArrayList<FavQuestionInfo>();  
//        Cursor cursor = queryTheCursor();  //查询所有时用
//        while (cursor.moveToNext()) {  
//        	FavQuestionInfo info = new FavQuestionInfo();  
//        	info.setCourseId(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_COURSE_ID)));
//        	info.setQuestionId(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ID)));
//        	info.setQuestionName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_NAME)));
//        	info.setQuestionType(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_TYPE)));
//        	info.setQuestionAnswer(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ANSWER)));
//        	info.setAnalysis(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ANALYSIS)));
//        	info.setMaterial(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL)));
//        	info.setMaterialImg(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL_IMG)));
//        	info.setChapterName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_CHAPTER_NAME)));
//        	info.setPaperName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_PAPER_NAME)));
//        	info.setOptionA(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_A)));
//        	info.setOptionB(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_B)));
//        	info.setOptionC(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_C)));
//        	info.setOptionD(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_D)));
//        	info.setOptionE(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_E)));
//        	info.setScore(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_SCORE)));
//        	info.setDifficulty(cursor.getInt(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_DIFFICULTY)));
//        	info.setK1(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K1)));
//        	info.setK2(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K2)));
//        	info.setK3(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K3)));
//        	info.setMaterialImgs(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL_IMGS)));
//            list.add(info);  
//        }  
//        return list.size();  
//	}
//	
//	/** 
//     * query all persons, return cursor 
//     * @return  Cursor 
//     */  
//    public Cursor queryTheCursor() {  
//    	//way 1
////        Cursor c = database.rawQuery("SELECT * FROM "+DBHelper.TABLE_NAME_MY_FAV_QUESTION+"", null);  
//    	
//    	//way 2
//    	//http://blog.csdn.net/lu1024188315/article/details/51734514
//    	String courseId = SharedPreferencesUtils.getIntParam(context, Constant.SharedPreference.courseId, -1)+"";
//    	Cursor c = database.query(DBHelper.TABLE_NAME_MY_FAV_QUESTION, null, DBHelper.MY_FAV_COURSE_ID+"=?", new String[]{courseId}, null, null, null);
//        return c;  
//    }  
//    
//    /** 
//     * query all persons, return cursor 
//     * @return  Cursor 
//     */  
//    public Cursor queryTheCursorByPage(int page,int pageSize) {  
//    	/***num[1]-->每一页显示的条目数量 
//    	 * 	  num[0]--->从第几条开始
//	     	  String sql = "select _id,province ,name from city order by _id limit "
//			 + num[0] + "," + num[1];
//			 cursor=db.query(TableName, null,null, null,null,null,null,"5,9");//"5,9",第6行开始,返回9行数据
//			 http://blog.csdn.net/lu1024188315/article/details/51734514
//		**/
////    	 String sql = "select * from "+DBHelper.TABLE_NAME_MY_FAV_QUESTION+" order by "+DBHelper.MY_FAV_ID+" limit "+ page+","+ pageSize;
////    	Log.e("select fav's sql --------------", sql);
////        Cursor c = database.rawQuery("SELECT * FROM "+DBHelper.TABLE_NAME_MY_FAV_QUESTION+"", null);  
//    	String courseId = SharedPreferencesUtils.getIntParam(context, Constant.SharedPreference.courseId, -1)+"";
//    	Cursor c = database.query(DBHelper.TABLE_NAME_MY_FAV_QUESTION, null, DBHelper.MY_FAV_COURSE_ID+"=?", new String[]{courseId}, null, null, DBHelper.MY_FAV_ID, (page-1)*pageSize+","+pageSize);
//        return c;  
//    }  
//    
//	/**
//	 * 添加一条我的收藏题数据
//	 * 
//	 * @param info
//	 * @return
//	 */
//	public long insertFavQuestion(FavQuestionInfo info) {
//		System.out.println("insert-id-start");
//		ContentValues newValues = new ContentValues();
//		newValues.put(DBHelper.MY_FAV_COURSE_ID, SharedPreferencesUtils.getIntParam(context, Constant.SharedPreference.courseId, -1)+"");
//		newValues.put(DBHelper.MY_FAV_QUESTION_ID, info.getQuestionId());
//		newValues.put(DBHelper.MY_FAV_QUESTION_NAME, info.getQuestionName());
//		newValues.put(DBHelper.MY_FAV_QUESTION_TYPE, info.getQuestionType());
//		newValues.put(DBHelper.MY_FAV_QUESTION_ANSWER, info.getQuestionAnswer());
//		newValues.put(DBHelper.MY_FAV_QUESTION_ANALYSIS, info.getAnalysis());
//		newValues.put(DBHelper.MY_FAV_QUESTION_MATERIAL, info.getMaterial());
//		newValues.put(DBHelper.MY_FAV_QUESTION_MATERIAL_IMG, info.getMaterialImg());
//		newValues.put(DBHelper.MY_FAV_QUESTION_CHAPTER_NAME, info.getChapterName());
//		newValues.put(DBHelper.MY_FAV_QUESTION_PAPER_NAME, info.getPaperName());
//		newValues.put(DBHelper.MY_FAV_QUESTION_OPTION_A, info.getOptionA());
//		newValues.put(DBHelper.MY_FAV_QUESTION_OPTION_B, info.getOptionB());
//		newValues.put(DBHelper.MY_FAV_QUESTION_OPTION_C, info.getOptionC());
//		newValues.put(DBHelper.MY_FAV_QUESTION_OPTION_D, info.getOptionD());
//		newValues.put(DBHelper.MY_FAV_QUESTION_OPTION_E, info.getOptionE());
//		newValues.put(DBHelper.MY_FAV_QUESTION_SCORE, info.getScore());
//		newValues.put(DBHelper.MY_FAV_QUESTION_DIFFICULTY, info.getDifficulty());
//		newValues.put(DBHelper.MY_FAV_QUESTION_K1, info.getK1());
//		newValues.put(DBHelper.MY_FAV_QUESTION_K2, info.getK2());
//		newValues.put(DBHelper.MY_FAV_QUESTION_K3, info.getK3());
//		newValues.put(DBHelper.MY_FAV_QUESTION_MATERIAL_IMGS, info.getMaterialImgs());
//		System.out.println("insert-id-end-");
//		return database.insert(DBHelper.TABLE_NAME_MY_FAV_QUESTION, null,
//				newValues);
//	}
//	
//	public long deleteFavQuestionById(String questionID){
//		
////		//删除SQL语句   
////		//方法一：
////		String sql = "delete from "+DBHelper.TABLE_NAME_MY_FAV_QUESTION+" where "+DBHelper.MY_FAV_QUESTION_ID+" = "+questionID;   
////		//执行SQL语句   
////		database.execSQL(sql); 
//		
//		System.out.println("delete-id-start=");
//		//方法二：
//		String whereClauses = DBHelper.MY_FAV_QUESTION_ID+"=?";  
//		String [] whereArgs = {questionID};  
//		System.out.println("delete-id-end=");
//		//调用delete方法，删除数据   
//		return database.delete(DBHelper.TABLE_NAME_MY_FAV_QUESTION, whereClauses, whereArgs);  
//		
//	}
//	
//	public FavQuestionInfo queryFavQuestionById(String questionId){
//		System.out.println("query--id-");
//		//参数1：表名   
//		//参数2：要想显示的列   
//		//参数3：where子句   
//		//参数4：where子句对应的条件值   
//		//参数5：分组方式   
//		//参数6：having条件   
//		//参数7：排序方式   
//		FavQuestionInfo favQuestionInfo = null;
//		Cursor cursor = database.query(DBHelper.TABLE_NAME_MY_FAV_QUESTION, new String[]{DBHelper.MY_FAV_COURSE_ID,DBHelper.MY_FAV_QUESTION_ID,DBHelper.MY_FAV_QUESTION_NAME,
//				DBHelper.MY_FAV_QUESTION_TYPE,DBHelper.MY_FAV_QUESTION_ANSWER,DBHelper.MY_FAV_QUESTION_ANALYSIS,DBHelper.MY_FAV_QUESTION_MATERIAL,DBHelper.MY_FAV_QUESTION_MATERIAL_IMG,
//				DBHelper.MY_FAV_QUESTION_CHAPTER_NAME,DBHelper.MY_FAV_QUESTION_PAPER_NAME,DBHelper.MY_FAV_QUESTION_OPTION_A,
//				DBHelper.MY_FAV_QUESTION_OPTION_B,DBHelper.MY_FAV_QUESTION_OPTION_C,DBHelper.MY_FAV_QUESTION_OPTION_D,DBHelper.MY_FAV_QUESTION_OPTION_E,
//				DBHelper.MY_FAV_QUESTION_SCORE,DBHelper.MY_FAV_QUESTION_DIFFICULTY,DBHelper.MY_FAV_QUESTION_K1,DBHelper.MY_FAV_QUESTION_K2,DBHelper.MY_FAV_QUESTION_K3,DBHelper.MY_FAV_QUESTION_MATERIAL_IMGS
//				}, DBHelper.MY_FAV_QUESTION_ID+"=?", new String[]{questionId}, null, null, null);  
//		while(cursor.moveToNext()){  
//		favQuestionInfo = new FavQuestionInfo();
//		favQuestionInfo.setCourseId(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_COURSE_ID)));
//		favQuestionInfo.setQuestionId(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ID)));
//		favQuestionInfo.setQuestionName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_NAME)));
//		favQuestionInfo.setQuestionType(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_TYPE)));
//		favQuestionInfo.setQuestionAnswer(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ANSWER)));
//		favQuestionInfo.setAnalysis(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_ANALYSIS)));
//		favQuestionInfo.setMaterial(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL)));
//		favQuestionInfo.setMaterialImg(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL_IMG)));
//		favQuestionInfo.setChapterName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_CHAPTER_NAME)));
//		favQuestionInfo.setPaperName(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_PAPER_NAME)));
//		favQuestionInfo.setOptionA(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_A)));
//		favQuestionInfo.setOptionB(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_B)));
//		favQuestionInfo.setOptionC(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_C)));
//		favQuestionInfo.setOptionD(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_D)));
//		favQuestionInfo.setOptionE(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_OPTION_E)));
//		favQuestionInfo.setScore(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_SCORE)));
//		favQuestionInfo.setDifficulty(cursor.getInt(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_DIFFICULTY)));
//		favQuestionInfo.setK1(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K1)));
//		favQuestionInfo.setK2(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K2)));
//		favQuestionInfo.setK3(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_K3)));
//		favQuestionInfo.setMaterialImgs(cursor.getString(cursor.getColumnIndex(DBHelper.MY_FAV_QUESTION_MATERIAL_IMGS)));
//		
//		System.out.println("query------->" + "QID："+favQuestionInfo.getQuestionId()+" "+"QC："+favQuestionInfo.getQuestionName());  
//		}  
//		return favQuestionInfo;
//	}
//	//========fav=======end================
//}
