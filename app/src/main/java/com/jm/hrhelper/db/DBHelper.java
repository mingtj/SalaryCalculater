package com.jm.hrhelper.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * 
 * 数据库管理辅助类，主要实现数据库的创建，版本更新。
 * 
 */
public class DBHelper extends SQLiteOpenHelper {
	
	//数据库名称
	static final String DB_NAME = "DB";
	static final int VERSION = 2;
	
	//题库数据
	static final String TABLE_NAME_TEST_LIBRARY = "table_test_library";
	static final String TEST_LIBRARY_COL_ID = "test_id";
	static final String TEST_LIBRARY_QUESTION_ID = "test_question_id";
	static final String TEST_LIBRARY_QUESTION_NAME = "test_question_name";
	static final String TEST_LIBRARY_QUESTION_TYPE = "test_question_type";
	static final String TEST_LIBRARY_QUESTION_ANSWER = "test_question_answer";
	static final String TEST_LIBRARY_QUESTION_ANALYSIS = "test_question_analysis";
	static final String TEST_LIBRARY_QUESTION_FOR = "test_question_for";
	static final String TEST_LIBRARY_QUESTION_SCORE = "test_question_score";
	static final String TEST_LIBRARY_QUESTION_OPTION_A = "test_question_option_a";
	static final String TEST_LIBRARY_QUESTION_OPTION_B = "test_question_option_b";
	static final String TEST_LIBRARY_QUESTION_OPTION_C = "test_question_option_c";
	static final String TEST_LIBRARY_QUESTION_OPTION_D = "test_question_option_d";
	
	//错误题数据
		static final String TABLE_NAME_MY_ERROR_QUESTION = "table_my_error_question";
		static final String MY_ERROR_QUESTION_ID = "_question_id";
		static final String MY_ERROR_QUESTION_NAME = "_question_name";
		static final String MY_ERROR_QUESTION_TYPE = "_question_type";
		static final String MY_ERROR_QUESTION_ANSWER = "_question_answer";
		static final String MY_ERROR_QUESTION_SELECTED = "_question_selected";
		static final String MY_ERROR_QUESTION_ISRIGHT = "_question_isright";
		static final String MY_ERROR_QUESTION_ANALYSIS = "_question_analysis";
		static final String MY_ERROR_QUESTION_OPTION_A = "_question_option_a";
		static final String MY_ERROR_QUESTION_OPTION_B = "_question_option_b";
		static final String MY_ERROR_QUESTION_OPTION_C = "_question_option_c";
		static final String MY_ERROR_QUESTION_OPTION_D = "_question_option_d";
		static final String MY_ERROR_QUESTION_OPTION_E = "_question_option_e";
		static final String MY_ERROR_QUESTION_OPTION_TYPE = "_question_option_type";
		
		//收藏的题目数据
		static final String TABLE_NAME_MY_FAV_QUESTION = "table_my_fav_question";
		static final String MY_FAV_ID= "fav_id";//ID
		static final String MY_FAV_COURSE_ID = "fav_course_id";//courseID
		static final String MY_FAV_QUESTION_ID = "fav_question_id";//ID
		static final String MY_FAV_QUESTION_NAME = "fav_question_name";//题目内容
		static final String MY_FAV_QUESTION_TYPE = "fav_question_type";//题目类型
		static final String MY_FAV_QUESTION_ANSWER = "fav_question_answer";//题目答案
		static final String MY_FAV_QUESTION_ANALYSIS = "fav_question_analysis";//题目分析
		
		static final String MY_FAV_QUESTION_MATERIAL = "fav_question_material";//材料分析题，文字材料
		static final String MY_FAV_QUESTION_MATERIAL_IMG = "fav_question_material_img";//材料分析题，文字材料，图片  <img>网页格式
		static final String MY_FAV_QUESTION_CHAPTER_NAME = "fav_question_chapterName";//题目所属章节名称
		static final String MY_FAV_QUESTION_PAPER_NAME = "fav_question_paperName";//所属题库名称，例如：模拟考卷一，
		
		static final String MY_FAV_QUESTION_OPTION_A = "fav_question_option_a";
		static final String MY_FAV_QUESTION_OPTION_B = "fav_question_option_b";
		static final String MY_FAV_QUESTION_OPTION_C = "fav_question_option_c";
		static final String MY_FAV_QUESTION_OPTION_D = "fav_question_option_d";
		static final String MY_FAV_QUESTION_OPTION_E = "fav_question_option_e";
		static final String MY_FAV_QUESTION_SCORE= "fav_question_score";
		static final String MY_FAV_QUESTION_DIFFICULTY = "fav_question_difficulty";
		static final String MY_FAV_QUESTION_K1 = "fav_question_k1";
		static final String MY_FAV_QUESTION_K2 = "fav_question_k2";
		static final String MY_FAV_QUESTION_K3 = "fav_question_k3";
		static final String MY_FAV_QUESTION_MATERIAL_IMGS = "fav_question_material_imgs";//材料分析题，文字材料，图片  json格式，数组
		
	/**
	 * 构造方法
	 * @param context
	 */
	public DBHelper(Context context) {
		super(context, DB_NAME, null, VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		//创建题库基本数据表语句
		String cerateTable_testLibrary = "CREATE TABLE "
				+ TABLE_NAME_TEST_LIBRARY + " ("
				+ TEST_LIBRARY_COL_ID
				+ " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ TEST_LIBRARY_QUESTION_ID + " TEXT,"
				+ TEST_LIBRARY_QUESTION_NAME + " TEXT,"
				+ TEST_LIBRARY_QUESTION_TYPE + " TEXT,"
				+ TEST_LIBRARY_QUESTION_ANSWER + " TEXT,"
				+ TEST_LIBRARY_QUESTION_FOR + " TEXT,"
				+ TEST_LIBRARY_QUESTION_SCORE + " TEXT,"
				+ TEST_LIBRARY_QUESTION_ANALYSIS + " TEXT,"
				+ TEST_LIBRARY_QUESTION_OPTION_A + " TEXT,"
				+ TEST_LIBRARY_QUESTION_OPTION_B + " TEXT,"
				+ TEST_LIBRARY_QUESTION_OPTION_C + " TEXT,"
				+ TEST_LIBRARY_QUESTION_OPTION_D + " TEXT)";
		

		String cerateTable_myErrorQuestion = "CREATE TABLE "
				+ TABLE_NAME_MY_ERROR_QUESTION + " ("
				+ MY_ERROR_QUESTION_ID
				+ " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ MY_ERROR_QUESTION_NAME + " TEXT,"
				+ MY_ERROR_QUESTION_TYPE + " TEXT,"
				+ MY_ERROR_QUESTION_ANSWER + " TEXT,"
				+ MY_ERROR_QUESTION_SELECTED + " TEXT,"
				+ MY_ERROR_QUESTION_ISRIGHT + " TEXT,"
				+ MY_ERROR_QUESTION_ANALYSIS + " TEXT,"
				+ MY_ERROR_QUESTION_OPTION_A + " TEXT,"
				+ MY_ERROR_QUESTION_OPTION_B + " TEXT,"
				+ MY_ERROR_QUESTION_OPTION_C + " TEXT,"
				+ MY_ERROR_QUESTION_OPTION_D + " TEXT,"
				+ MY_ERROR_QUESTION_OPTION_E + " TEXT,"
				+ MY_ERROR_QUESTION_OPTION_TYPE + " TEXT)";
		
		String cerateTable_myFavQuestion = "CREATE TABLE "
				+ TABLE_NAME_MY_FAV_QUESTION + " ("
				+ MY_FAV_ID
				+ " INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ MY_FAV_COURSE_ID + " TEXT,"
				+ MY_FAV_QUESTION_ID + " TEXT,"
				+ MY_FAV_QUESTION_NAME + " TEXT,"
				+ MY_FAV_QUESTION_TYPE + " TEXT,"
				+ MY_FAV_QUESTION_ANSWER + " TEXT,"
				+ MY_FAV_QUESTION_ANALYSIS + " TEXT,"
				+ MY_FAV_QUESTION_MATERIAL + " TEXT,"
				+ MY_FAV_QUESTION_MATERIAL_IMG + " TEXT,"
				+ MY_FAV_QUESTION_CHAPTER_NAME + " TEXT,"
				+ MY_FAV_QUESTION_PAPER_NAME + " TEXT,"
				+ MY_FAV_QUESTION_OPTION_A + " TEXT,"
				+ MY_FAV_QUESTION_OPTION_B + " TEXT,"
				+ MY_FAV_QUESTION_OPTION_C + " TEXT,"
				+ MY_FAV_QUESTION_OPTION_D + " TEXT,"
				+ MY_FAV_QUESTION_OPTION_E + " TEXT,"
				+ MY_FAV_QUESTION_SCORE+ " TEXT,"
				+ MY_FAV_QUESTION_DIFFICULTY + " INTEGER,"
				+ MY_FAV_QUESTION_K1 + " TEXT,"
				+ MY_FAV_QUESTION_K2 + " TEXT,"
				+ MY_FAV_QUESTION_K3 + " TEXT,"
				+MY_FAV_QUESTION_MATERIAL_IMGS+" TEXT)";
		
		
		db.execSQL(cerateTable_testLibrary);
		db.execSQL(cerateTable_myErrorQuestion);
		db.execSQL(cerateTable_myFavQuestion);
		
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

	}

}
