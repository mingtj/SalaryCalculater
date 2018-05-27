//package com.jm.hrhelper.db;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.xutils.DbManager;
//import org.xutils.x;
//import org.xutils.db.sqlite.WhereBuilder;
//import org.xutils.db.table.TableEntity;
//import org.xutils.ex.DbException;
//import android.annotation.SuppressLint;
//import android.content.Context;
//import android.util.Log;
//
//import com.tencent.bugly.crashreport.biz.UserInfoBean;
//
///**
// * @author mingtingjie
// *
// */
//@SuppressLint("NewApi")
//public class DbUtils {
//
//	private static final String TAG = "DbUtils";
//
//	private static DbUtils dbot;
//
//	private DbManager db;
//
//	public static DbUtils getInstance(Context context) {
//		if (dbot == null)
//			synchronized (DbUtils.class) {
//				if (dbot == null)
//					dbot = new DbUtils(context);
//			}
//		return dbot;
//	}
//
//	// 构造函数
//	public DbUtils(Context context) {
//			initDb();
//		}
//
//
//	private void initDb(){
//		 //本地数据的初始化
//        DbManager.DaoConfig daoConfig = new DbManager.DaoConfig()
//        		.setDbName("zbtraining")//数据库名称
//                .setDbVersion(1) //设置数据库版本,每次启动应用时将会检查该版本号,发现数据库版本低于这里设置的值将进行数据库升级并触发DbUpgradeListener
//                .setAllowTransaction(true)//设置是否开启事务,默认为false关闭事务
//                .setDbOpenListener(new DbManager.DbOpenListener() {
//		                @Override
//		                public void onDbOpened(DbManager db) {
//		                    // 开启WAL, 对写入加速提升巨大
//		                    db.getDatabase().enableWriteAheadLogging();
//		                }
//		            })
//                .setTableCreateListener(new DbManager.TableCreateListener() {
//					@Override
//					public void onTableCreated(DbManager db,
//							TableEntity<?> table) {
//						// TODO Auto-generated method stub
//						Log.i("dbTableName>>="+TAG, table.getName());
//						System.out.println("dbTableName>>="+ table.getName());
//
//					}
//                })//设置数据库创建时的Listener
//                .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
//                    @Override
//                    public void onUpgrade(DbManager db, int oldVersion, int newVersion) {
//                    	// db.addColumn(...);
//	                    // db.dropTable(...);
//	                    // ...
//	                    // or
//	                    // db.dropDb();
//
//	//                	 	db.execSQL("DROP TABLE IF EXISTS " + FCCTable.Channel.TABLE_NAME);
//	//                     db.execSQL("DROP TABLE IF EXISTS " + FCCTable.RayCode.TABLE_NAME);
//                    }
//                });//设置数据库升级时的Listener,这里可以执行相关数据库表的相关修改,比如alter语句增加字段等
//        db = x.getDb(daoConfig);
//	}
//
//	/**
//	 * 添加下载完成的视频信息到数据库
//	 * @param info
//	 */
//	public void insertVideo(DownloadInfo info){
//		 try {
//			 Log.i(TAG, "=DownloadInfo="+info.getLabel());
//			 System.out.println("=DownloadInfo="+info.getLabel());
//			 db.save(info);
//		} catch (DbException e) {
//			e.printStackTrace();
//		}
//	}
//
//	/**
//	 * 查询所有已下载视频数据
//	 * @return
//	 */
//	public List<DownloadInfo> queryAllVideo(){
//		List<DownloadInfo> list = new ArrayList<DownloadInfo>();
//		try {
//			list = db.findAll(DownloadInfo.class);
//		} catch (DbException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(list!=null&&list.size()>0)
//		return list;
//		else
//		return new ArrayList<DownloadInfo>();
//	}
//
//	/**
//	 * 根据视频名称查询视频
//	 * @param videoName
//	 * @return
//	 */
//	public DownloadInfo queryVideoByVideoName(String videoName){
//		List<DownloadInfo> theDownloadInfo=null;
//
//		try {
//			theDownloadInfo = db.selector(DownloadInfo.class).where("label", "=",videoName).findAll();
//		} catch (DbException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		if(theDownloadInfo!=null&&theDownloadInfo.size()>0)
//			return theDownloadInfo.get(0);
//		else
//			return null;
//	}
//
//
//	public DownloadInfo queryVideoByLessonTitle(String lessonTitle){
//		List<DownloadInfo> theDownloadInfo=null;
//
//		try {
//			theDownloadInfo = db.selector(DownloadInfo.class).where("lessonTitle", "=",lessonTitle).findAll();
//		} catch (DbException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		if(theDownloadInfo!=null&&theDownloadInfo.size()>0)
//			return theDownloadInfo.get(0);
//		else
//			return null;
//	}
//
//	public DownloadInfo queryVideoByLessonId(int lessonId){
//		List<DownloadInfo> theDownloadInfo=null;
//
//		try {
//			theDownloadInfo = db.selector(DownloadInfo.class).where("lessonId", "=",lessonId).findAll();
//		} catch (DbException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//		if(theDownloadInfo!=null&&theDownloadInfo.size()>0)
//			return theDownloadInfo.get(0);
//		else
//			return null;
//	}
//
//	/***
//	 * 根据下载到本地的文件名，移除对应的文件
//	 * @param videoName
//	 */
//	public void deleteVideoByVideoName(String videoName){
//		try {
//            db.delete(DownloadInfo.class, WhereBuilder.b("label", "=", videoName));
//        } catch (DbException e) {
//            e.printStackTrace();
//        }
//	}
//
//	/**插入用户数据**/
//	public void insertUserInfo(UserInfoBean userInfoBean){
//		 try {
//			 Log.i(TAG, "=userName="+userInfoBean.getNickname());
//			 System.out.println("=userName="+userInfoBean.getNickname());
////			db.saveBindingId(userInfoBean);
//			 db.save(userInfoBean);
//		} catch (DbException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//
//	/*** 删除用户信息*/
//	public void deleteUserInfo(){
//		try{
//			//删除表中的所有数据
//			db.delete(UserInfoBean.class);
//		}catch(DbException e){
//			e.printStackTrace();
//		}
//	}
//
//	/**查询本地用户信息**/
//	public boolean queryUserInfo(){
//		try{
//			//查询第一条数据 findFirst
//			UserInfoBean infoBean  = db.findFirst(UserInfoBean.class);
//			if(infoBean==null){
//				return false;
//			}else{
//				return true;
//			}
//		}catch(DbException e){
//			e.printStackTrace();
//		}
//		return false;
//	}
//
//
//
////	/**
////	 * 根据歌单id 查询歌曲列表
////	 */
////	public List<Song> selectSongByFmId(int fmid){
////		List<Song> list = new ArrayList<Song>();
////		try {
////			list = db.findAll(Selector.from(Song.class).where("fmid","=",fmid));
////		} catch (DbException e) {
////			LogUtils.e(e.getMessage(), e);
////		}
////		if(list==null||list.size()<=0){
////			return null;
////		}else{
////			return list;
////		}
////
////	}
////
////	/**
////	 * 查询所有下载歌曲
////	 */
////	public List<Song> findAll(){
////	List<Song> list = new ArrayList<Song>();
////	try {
////		list = db.findAll(Selector.from(Song.class));
////	} catch (DbException e) {
////		LogUtils.e(e.getMessage(), e);
////	}
////	if(list==null||list.size()<=0){
////		return new ArrayList<Song>();
////	}else{
////		return list;
////	}
////
////}
////
////	/**
////	 * 根据id删除歌曲
////	 */
////	public void deleteBySongId(int songid) throws DbException {
////		db.delete(Song.class,WhereBuilder.b("id", "=", songid));
////	}
////
////
////	/**
////	 * 根据id查询已经下载完成的歌曲
////	 * @param netId
////	 * @return
////	 */
////	public Song selectSongById(long netId){
////		Song song=null;
////		if(song==null){
////			try {
////				song = db.findFirst(Selector.from(Song.class)
////						.where("id", "=", netId));
////			} catch (DbException e) {
////				e.printStackTrace();
////			}
////		}
////		return song;
////	}
////
////
////	/**
////	 * 查询这个歌曲是否存在
////	 * @param menuId
////	 * @return
////	 */
////	public boolean isExist(Long songId) {
////		Song song=null;
////		if(song==null){
////			try {
////				song = db.findFirst(Selector.from(Song.class)
////						.where("id", "=", songId));
////			} catch (DbException e) {
////				e.printStackTrace();
////			}
////		}
////		if(song!=null){
////			return true;
////		}
////		return false;
////	}
////
////	/**
////	 * 删除所有
////	 */
////	public void deleteAll(){
////		try {
////			db.deleteAll(Song.class);
////		} catch (DbException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////	}
//
//
//}
