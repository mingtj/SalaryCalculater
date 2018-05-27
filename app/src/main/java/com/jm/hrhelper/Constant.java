 package com.jm.hrhelper;

import java.io.File;

import android.os.Environment;


public class Constant {

	
	//微信APPID,用于微信登录，支付场景
	public static final String WEIXIN_APP_ID = "";
	
	//页面数值传递  课程列表页到课程详细页
	public static final String CourseID = "courseId";
	
	//页面数值传递  课程列表页到课程详细页
	public static final String CourseName = "courseName";
	
	//页面数值传递  课程列表页到课程详细页
	public static final String CoursePrice = "coursePrice";
	
	//页面数据传递  购买课程是否需要填写收货地址
	public static final String isNeedExpress = "needExpress";
	
	//页面数值传递  老师列表页到老师详细页
	public static final String Teacher = "teacher";
	
	//页面数据传递，已购买课程，传递keshi对象
	public static final String Keshi = "keshi";
	
	//页面数据传递，收货地址
	public static final String Addr = "addr";
	
	//页面数据传递，收货地址，是否从付款页面跳转过来
	public static final String OrderAddr = "orderAddr";
	
	//播放服务
	public static final String SERVICE_ACTION = "com.tuanzitech.edu.service.videoplayer";
	
	//视频地址  服务动态传递
	public static final String SERVICE_VIDEO_PATH = "videoPath";
	
	//package
	public static final String App_PACKAGE = "com.tuanzitech.edu";
	
	//appId   用于升级
	public static final String APP_ID_UPDATE = "7c65db309ead46c6b8fb8091d0e394d8";
	
	public static class Contact{
		public static final String lessonPhone = "tel:4006550919";
		public static final String comPhone = "tel:18667155226";
	}
	
	public static class Course{
		public static final String zhenTi = "01";//真题
		public static final String moniTi = "02";//模拟题
		public static final String pageIndex = "pageIndex";//模拟题
	}
	
	public static class SharedPreference{
		public static final String  subjectId = "subjectId";//一级分类，例如心里咨询师，人力资源师
		public static final String  courseId = "courseId";//二级分类，心里咨询师二级
		public static final String  chapterId = "chapterId";//章节练习二级
		public static final String  paperId = "paperId";//二级分类 程分类标示名称
		public static final String  courseZT = "courseZT";//题目类型，真题
		public static final String  courseLX = "courseLX";//题目类型，章节练习
		public static final String  noSelectType = "题库科目";
		
		public static final String  IM_UserID = "imUserId";
		public static final String  IM_UserType = "imUserType";
		public static final String  IM_UserSig = "imUserSig";
		public static final String  IM_GroupID = "imGroupId";
		public static final String  IM_UserNickName = "imUserNickName";
	}
	
	//应用本地地址管理，视频下载地址，apk更新下载包地址
	public static class AppFilePath{
		
		/** sd卡路径*/
		public static final String externalRootFilePath = Environment.getExternalStorageDirectory().toString();
		/**应用在sd上的文件夹*/
		public static final String myRootFilePath = externalRootFilePath + File.separator + "TuanZiEdu";
		/**视频下载地址***/
		public static final String videoFilePath = myRootFilePath + File.separator + "VideoCache"+ File.separator;
		/***升级包下载地址**/
		public static final String updateFilePath = myRootFilePath + File.separator + "Update"+ File.separator;
		/** BUG路径*/
		public static final String crashFilePath = myRootFilePath + File.separator + "Crash"+ File.separator;
		public static final String appFileName = "edu321.apk";
	}
	
	/**初始化 sd卡上的文件夹*/
	public static void initFloder(){
		File rootFile = new File(AppFilePath.myRootFilePath);
		if(!rootFile.exists()){
			rootFile.mkdir();
		}
		
		File cacheFile = new File(AppFilePath.videoFilePath);
		if(!cacheFile.exists()){
			cacheFile.mkdir();
		}
		
		File crashFile = new File(AppFilePath.crashFilePath);
		if(!crashFile.exists()){
			crashFile.mkdir();
		}
		
		File apkFile = new File(AppFilePath.updateFilePath);
		if(!apkFile.exists()){
			apkFile.mkdir();
		}
	}
	
	public static class DownladState{
		
		public static final String WAITING = "排队中";
		public static final String STARTED = "下载中";
		public static final String FINISHED = "完成";
		public static final String STOPPED = "已暂停";
		public static final String ERROR = "出错了";

	}
	
	public static class Exam{
		public static final String isCorrect="1";//正确
		public static final String isError="0";//错误
	}
	
	//本地保存的shared key
	public static class SharedKey{
		//用户token，用户登录过期，需要清空
		public static final String UserToken = "userToken";
		//本地Token，用户开启app页面和登录
		public static String UserTokenValue = "";
	}
	
	//接口ErrorCode
	public static class HttpErrorCode{
		/**
		200：成功
		400：参数、逻辑错误
		401：未登录
		403：无权限
		500：内部异常
		 */
		//接口请求成功
		public static final int HTTP_REQUEST_SUCCESS = 200;
		//请求参数错误
		public static final int HTTP_PARAM_ERROR = 400;
		//登录错误，token过期
		public static final int HTTP_TOKEN_ERROR = 401;
		//无权限
		public static final int HTTP_PERMISS_ERROR = 403;
		//内部异常
		public static final int HTTP_UNKOWN_ERROR = 500;
	}
	
	public static String temp = "01";
	
	/**
	 * 阿里旺信IM
	 */
	public static class aliIm{
		public static final String appKey = "23451832";
		public static final String appSecret = "4df0c41030d03147742ab5fca883bc1b";
		public static final String testGroupId = "1957371896";
		public static final String testUserId = "test1";
		public static final String testUserPwd = "111111";
	}
	
	/**
	 * 环信IM
	 */
	public static class hxIm{
		public static final String appKey = "1101161201178717#ytyedu";
		public static final String testUserId = "10001";
		public static final String testUserId2 = "10002";
		public static final String testUserId9 = "10009";
		public static final String testUserPwd = "8c686ffc1eb416d706ad61cdc0c51dfbd95f78b9";
		public static final String testGroupId = "271003402152968616";
		
		public static final String testUserPwd2 = "bf8bc99e22252ed0ac7fab988a2eab4c444881cd";
		public static final String testUserPwd9 = "51ab5a4152f45bf124165eb8fa5d70d393e02d24";
	}
	
	/**
	 * 腾讯IM
	 */
	public static class txIm{
		public static final String testUserId = "10001";
		public static final String testUserId2 = "10002";
		public static final String testUserId3 = "10003";
		public static final String testGroupId = "@TGS#3V5SCVJEH";
//		public static final String testGroupId = "@TGS#3J2LANJEG";

		public static final int appId = 1400020121;
		public static final String accountType = "9120";
		public static final String userSig = "eJxFkFFPgzAUhf8Lrxp3CytWEx-Uam1gOgKLZi9NpQU7lFaom8b432XI4uv35eacc7*DIs1PpHNGCelF1KngPIDgeMT605lOC1l53Q0YYYxDgIPd6q43th1ECAijMAL4l0bp1pvK-B0OHE2iN-VAFjera57RRdarx9oXSZXf9erh2Sbcb-PZ*gmhXeNoZ5PMq-p2t6aXvGb0lazmbDlbsndWtgq-bBhtOKSpg4JhuzmSV-c8r*ISLg5hqhHjtn2J*b7FGYnxJL150yMncBqRmIQTl2VpP1ov-JfT4zN*fgH06FZ9";
		public static final String userSig2 = "eJxtz11PgzAUgOH-0tsZLS1lxbvNLbII7oN9ZN40tS1SCQWhbqDxv8twy268fZ9zcnK*wTqMb3lZasm4ZbiS4B44LoTQ8alHwE3vqil1pRhPrKpOTghB3chZD6qqdWE6QNAhDsIQXlFLZaxO9N9i19EZav3WlWi6f5gtJ4s8ndOxLxZtzA*b43FXB2tPZNvw9UmL*MtfjedmStNwEi1n6Sh6z5V6lAPXrto6eWmeMZIuHpgEbqJgW97FH024txkqRsHlmMxY-*R-31mdq75TOCSON7x0LkTxaSyzbXlyH2IKfn4BWptZgQ__";
		public static final String userSig3 = "eJxtz11PgzAUgOH-0muj-bAUTLwA3aSTzSxOM7xp6tph2WRNKShZ-O8yxHjj7fuck5NzBKvs8Vxaa5SQXhCnwBVAlxBCFIUBBWeD609rnBZy67U7OaUU9yOjttrV5lD1gCGiCBMI-9AoXXmzNT*LfScj1Kboy3zydMPTcp-fFbUsX5FXNs5ny-LiLVGLIGmyzNEgUuZWcj5bdiw2k7hdSMXq*Hmacp28tHPW7VZO0-29Ih8oxNU6nRaRfcjXDb-*PaZ2Ynjyv**8eddDDyGjiCE8drnZHJrKC9-Zk0eQhODrGyQGWQk_";
	}
	
	public static class ImMsgType{
		/**
		 * 1.普通   常规
		 * 1.普通@  @tip
		 * 2.助教    Color
		 * 3.助教@  Color+@tip
		 */
		public static final String Student = "S";
		public static final String Assnation = "A";
		
	}
	
	
	/**
	 * 订单支付状态
	 * @author mingtingjie
	 *
	 */
	public static class OrderState{
		//01、创建；02：成功；03:失败；04：失效"
		//订单创建成功
		public static final String Order_Create_Success = "01";
		//订单支付成功
		public static final String Order_Pay_Success = "02";
		//订单支付失败
		public static final String Order_Pay_Failure = "03";
		//订单失效
		public static final String Order_Pay_Disable = "04";
	} 
	
	/**
	 * 课程销售状态
	 */
	public static class CourseSaleState{
		//		03:待销售；04:销售中；05:已售完；06:停止销售
		//待销售
		public static final String Wait_Sale ="03";
		//销售中
		public static final String SaleIng ="04";
		//已经售完
		public static final String SaleOver ="05";
		//停止销售
		public static final String Stop_Sale ="06";
	}
	
	/**
	 * 课程直播状态
	 */
	public static class CourseLiveState{
		//		01:未开课；02:直播中；03:直播停止；04:直播结束；05:点播下载
//		//未开课
		public static final String Live_NoStart ="01";
		//直播中
		public static final String Live_Onliving ="02";
		//直播停止
		public static final String Live_Stop ="03";
		//直播结束
		public static final String Live_Over ="04";
		//点播下载
		public static final String Live_Download ="05";
	}
	
	public static class MsgForHandler{
//		public static final int MSG_ADDR_LIST = 777;
//		public static final int MSG_ADDR_TOP = MSG_ADDR_LIST+1;
		
		
	}
	
	
	//用户退出登录广播
	public static final String User_LoginOut= "com.tuanzitech.edu.userloginout";
	
	public static final String ACCOUNT_REMOVED = "account_removed";	
	
	public static final String PACKAGE_NAME = "com.tuanzitech.edu";	
	
	public static final String PACKAGE_START_CLASS = "com.tuanzitech.edu.activity.SplashActivity";	
	
	//公司网站
	public static final String CompWebSite = "http://www.tuanzitech.com/";
	//用户注册许可协议
	public static final String XuKe = "http://edu.tuanzitech.com/eduHtml/private_regulation.html";//http://edu.tuanzitech.com/eduHtml/private_regulation.html
	//接口正式地址
	public static	String SERVER_ADDR = "http://edu.tuanzitech.com/eduService";
	//测试接口地址
//	public static	String SERVER_ADDR = "http://api.zhongbo.tv/eduService";
//	public static	String SERVER_ADDR = "http://192.168.80.142:8080/eduService/";
	
	
	
	//用户注册  获取加密KEY   注册获取验证码之前先获取加key  将密码进行加密
	public static String USER_REGISTER_SECURITY_KEY = SERVER_ADDR+"/securityKey";//单独加了 /
	//用户注册，获取到验证码之后，调注册接口
	public static String USER_REGISTER = SERVER_ADDR+"/user/register";//单独加了 /
	//用户注册发送手机验证码
	public static String REGISTER_VERIFY_CODE = SERVER_ADDR+"/user/register/sendVerifyCode";
	//重置密码发送手机验证码
	public static String GET_VERIFY_CODE = SERVER_ADDR+"/user/resetLoginPassword/sendVerifyCode";
	//发送手机验证码  更新手机号码
	public static String GET_VERIFY_CODE_UPDATE_PHONE = SERVER_ADDR+"/user/updatePhone/sendVerifyCode";
	//用户登录接口  手机号码登录
	public static String USER_LOGIN_PHONE = SERVER_ADDR+"/user/app/phoneLogin";
	//用户登录接口  手机号码登录
	public static String USER_LOGIN_NAME = SERVER_ADDR+"/user/app/nameLogin";
	//用户详细信息接口
	public static String USER_INFO = SERVER_ADDR+"/user/detail";
	//用户信息修改
	public static String USER_INFO_UPDATE = SERVER_ADDR+"/user/update";
	//用户更换手机号码
	public static String USER_UPDATE_PHONE = SERVER_ADDR+"/user/updatePhone";
	//用户密码更换
	public static String USER_PWD_UPDATE = SERVER_ADDR+"/user/updateLoginPassword";
	//用户密码重置，忘记密码情况下，通过手机号码重置新的密码
	public static String USER_PWD_RESET = SERVER_ADDR+"/user/resetLoginPassword";
	//获取所有课程列表
	public static	String COURSE_LIST = SERVER_ADDR+"/course/list";
	//获取用户已经购买的课程列表
	public static String USER_COURSE_LIST = SERVER_ADDR+"/user/courses";
	//根据课程id获取某个课程
	public static	String COURSE_DETAIL = SERVER_ADDR+"/course/detail";
	//根据老师id获取某个老师的所有课程列表
	public static	String COURSE_LIST_TEACHER = SERVER_ADDR+"/teacher/historyLessons";
	//获取老师详细信息
	public static	String COURSE_TEACHER = SERVER_ADDR+"/teacher/detail";
	//获取用户购买的课程的上课时间表
	public static String COURSE_LESSON_LIST = SERVER_ADDR+"/user/lessons";
	//创建订单
	public static String COURSE_ORDER_CREATE = SERVER_ADDR+"/order/create";
	//免费购买
	public static String  COURSE_ORDER_FREE = SERVER_ADDR+"/course/freeBuy";
	//推荐
	public static String COURSE_RECOMMEND = SERVER_ADDR+"/banner/list";
	//查询订单状态
	public static String COURSE_ORDER_PAYQUERY = SERVER_ADDR+"/order/query";
	//用户退出
	public static String USER_LOGIN_OUT = SERVER_ADDR+"/user/logout";
	//升级接口
	public static String APP_UPDATE  = "http://upgrade.zhongbo.tv/appUpgrade/appVersion";
	//用户反馈
	public static String USER_FEEDBACK = SERVER_ADDR+"/user/feedback";
	
	//==============start===收货地址相关========================
	//省份
	public static String USER_ADDR_Province = SERVER_ADDR+"/province";
	//city
	public static String USER_ADDR_City = SERVER_ADDR+"/city";
	//查询用户所有收货地址
	public static String USER_ADDRS = SERVER_ADDR+"/user/express/list";
	//查询收货地址详细
	public static String USER_ADDR_DETAIL = SERVER_ADDR+"/user/express/detail";
	//添加收货地址
	public static String USER_ADDR_CREATE = SERVER_ADDR+"/user/express/create";
	//编辑收货地址
	public static String USER_ADDR_UPDATE = SERVER_ADDR+"/user/express/update";
	//删除收货地址
	public static String USER_ADDR_DETELE  = SERVER_ADDR+"/user/express/delete";
	//设置为默认收货地址
	public static String USER_ADDR_SETDEF = SERVER_ADDR+"/user/express/setDefault";
	//物流查询
	public static String USER_ADDR_EXPRESSINFO = SERVER_ADDR+"/order/express/list";
	
	//==========end=========收货地址相关===========================
	
	
	//=======题库====start=========
	//科目分类
	public static String EXAM_SUBJECT_TYPE  = SERVER_ADDR+"/category/subjects";
	//科目下课程分类
	public static String EXAM_SUB_COURSE_TYPE  = SERVER_ADDR+"/category/courses";
	//课程下章节
	public static String EXAM_SUB_COUR_ZJ = SERVER_ADDR+"/category/chapters";
	//章节练习分类
	public static String EXAM_SUB_COUR_ZJTYPE = SERVER_ADDR +"/question/chapter/list";
	//指定科目随机题目
	public static String EXAM_RANDOM_COURSE =   SERVER_ADDR+"/question/chapter/questions";//   /question/chapter/questions
	//真题
	public static String EXAM_ZHENTI_TYPE = SERVER_ADDR+"/question/paper/list";//真题分类列表
	//真题题目
	public static String EXAM_ZHENTI_COURSE = SERVER_ADDR +"/question/paper/questions";
	//添加错题
	public static String EXAM_ADD_WRONG= SERVER_ADDR +"/question/wrong/add";
	//删除错题
	public static String EXAM_DETELE_WRONG = SERVER_ADDR +"/question/wrong/delete";
	//错题列表
	public static String EXAM_WRONG_LIST = SERVER_ADDR +"/question/wrong/questions";
	//
	//	public static String EXAM_DISFAV = SERVER_ADDR +"/question/favorite/delete";
	//题目收藏
	public static String EXAM_FAV = SERVER_ADDR +"/question/favorite/add";
	//取消收藏
	public static String EXAM_DISFAV = SERVER_ADDR +"/question/favorite/delete";
	//收藏题目列表
	public static String EXAM_FAV_LIST = SERVER_ADDR+"/question/favorite/questions";
	//收藏题目id列表
	public static String EXAM_FAV_IDS = SERVER_ADDR+"/question/favorite/questionIds";
	
	//========题库====end=========
	
	
	//========TX=======im=====start=======
	//获取用户IM 账号信息
	public static String IM_ACCOUNT_INFO = SERVER_ADDR+"/im/user";
	public static String IM_ACCOUNT_ONLINE_MSG_LIST = SERVER_ADDR+"/im/lesson/message";
	
	/**
	 * /im/lesson/message?lessonId=130&startTime=1481187600000&endTime=1481189100000    需要token
	 */
	//==========tx=======im====end=======
}
