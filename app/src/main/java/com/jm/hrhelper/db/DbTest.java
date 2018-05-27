//package com.jm.hrhelper.db;
//
//import org.xutils.DbManager;
//import org.xutils.x;
//import org.xutils.db.table.TableEntity;
//import org.xutils.ex.DbException;
//
//
//
//public class DbTest {
//
//	/**
//	 * XUtils3.3.6
//	 * DB 使用
//	 * **/
//	private DbManager db;
//	
//	DbManager.DaoConfig daoConfig = new DbManager.DaoConfig()
//	.setDbName("zbtraining")//数据库名称
//    .setDbVersion(1) //设置数据库版本,每次启动应用时将会检查该版本号,发现数据库版本低于这里设置的值将进行数据库升级并触发DbUpgradeListener
//    .setAllowTransaction(true)//设置是否开启事务,默认为false关闭事务
//    .setDbOpenListener(new DbManager.DbOpenListener() {
//            @Override
//            public void onDbOpened(DbManager db) {
//                // 开启WAL, 对写入加速提升巨大
//                db.getDatabase().enableWriteAheadLogging();
//            }
//        })
//    .setTableCreateListener(new DbManager.TableCreateListener() {
//		@Override
//		public void onTableCreated(DbManager db,
//				TableEntity<?> table) {
//			// TODO Auto-generated method stub
//			System.out.println("dbTableName>>="+ table.getName());
//			
//		}
//    })//设置数据库创建时的Listener
//    .setDbUpgradeListener(new DbManager.DbUpgradeListener() {
//        @Override
//        public void onUpgrade(DbManager db, int oldVersion, int newVersion) {
//        	// db.addColumn(...);
//            // db.dropTable(...);
//            // ...
//            // or
//            // db.dropDb();
//        }
//    });//设置数据库升级时的Listener,这里可以执行相关数据库表的相关修改,比如alter语句增加字段等
//	
//	
//	/**插入数据**/
//	public void insert() throws DbException{
//		db = x.getDb(daoConfig);
//		db.save(UserInfoBean.class);
//	}
//	
//	
//	/**删除数据库表所有数据**/
//	public void deleteTableData() throws DbException{
//		db = x.getDb(daoConfig);
//		db.delete(UserInfoBean.class);
//	}
//	
//	/**删除数据库表**/
//	public void deleteTable() throws DbException{
//		db = x.getDb(daoConfig);
//		db.dropTable(UserInfoBean.class);
//	}
//}
