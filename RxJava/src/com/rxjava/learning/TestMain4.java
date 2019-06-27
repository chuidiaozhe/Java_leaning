package com.rxjava.learning;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestMain4 {
    public static void main(String args[]){
//       createTest();
//        justTest();
//        fromTest();
//        deferTest();

//         intervalTest();
//        rangeTest();

         String huitie1Str =  "2018年9月8日 上午12:13\n" +
                 "2018年9月8日 上午12:20\n" +
                 "2018年9月8日 上午9:02\n" +
                 "2018年9月8日 下午12:53\n" +
                 "2018年9月8日 下午12:57\n" +
                 "2018年9月8日 下午1:57\n" +
                 "2018年9月8日 下午3:18\n" +
                 "2018年9月8日 下午5:24\n" +
                 "2018年9月8日 下午5:38\n" +
                 "2018年9月8日 下午6:43\n" +
                 "2018年9月8日 下午9:49\n" +
                 "2018年9月9日 上午9:56\n" +
                 "2018年9月9日 上午11:16\n" +
                 "2018年9月9日 下午11:01\n" +
                 "2018年9月9日 上午10:22\n" +
                 "2018年9月9日 下午5:20\n" +
                 "2018年9月9日 下午7:23\n" +
                 "\n" +
                 "2018年9月8日 下午12:47\n" +
                 "2018年9月8日 下午1:12\n" +
                 "2018年9月8日 下午1:15\n" +
                 "2018年9月8日 下午2:54\n" +
                 "2018年9月8日 下午6:23\n" +
                 "2018年9月8日 下午10:39\n" +
                 "2018年9月8日 下午11:31\n" +
                 "2018年9月9日 下午6:45\n" +
                 "2018年9月9日 下午7:31\n" +
                 "2018年9月9日 上午12:19\n" +
                 "2018年9月7日 上午10:21\n" +
                 "2018年9月7日 下午11:02\n" +
                 "2018年9月8日 上午12:25\n" +
                 "2018年9月8日 上午12:44\n" +
                 "2018年9月8日 下午1:04\n" +
                 "2018年9月8日 下午4:09\n" +
                 "2018年9月8日 下午5:34\n" +
                 "2018年9月8日 下午6:33\n" +
                 "2018年9月8日 下午9:38\n" +
                 "2018年9月9日 上午11:18\n" +
                 "2018年9月9日 下午4:17\n" +
                 "2018年9月9日 上午8:46\n" +
                 "2018年9月8日 上午12:17\n" +
                 "2018年9月8日 下午5:03\n" +
                 "2018年9月8日 上午12:40\n" +
                 "2018年9月8日 下午2:02\n" +
                 "2018年9月8日 下午2:49\n" +
                 "2018年9月8日 下午5:32\n" +
                 "2018年9月6日 下午6:25\n" +
                 "2018年9月9日 上午9:54\n" +
                 "2018年9月6日 下午8:28\n" +
                 "2018年9月6日 下午9:07\n" +
                 "2018年9月7日 上午10:34\n" +
                 "2018年9月7日 上午11:43\n" +
                 "2018年9月7日 下午11:30\n" +
                 "2018年9月8日 上午12:13\n" +
                 "2018年9月8日 下午1:08\n" +
                 "2018年9月8日 下午1:59\n" +
                 "2018年9月8日 下午2:44\n" +
                 "2018年9月8日 下午3:15\n" +
                 "2018年9月8日 下午5:29\n" +
                 "2018年9月8日 下午6:33\n" +
                 "2018年9月8日 下午7:19\n" +
                 "2018年9月8日 下午9:44\n" +
                 "2018年9月9日 上午10:1\n" +
                 "2018年9月9日 上午10:32\n" +
                 "2018年9月9日 下午12:47\n" +
                 "2018年9月9日 下午4:06\n" +
                 "2018年9月9日 下午4:33\n" +
                 "2018年9月9日 下午5:42\n" +
                 "\n" +
                 "2018年9月8日 下午12:58\n" +
                 "2018年9月8日 下午1:37\n" +
                 "2018年9月8日 下午2:46\n" +
                 "2018年9月8日 下午5:23\n" +
                 "2018年9月8日 下午5:27\n" +
                 "2018年9月8日 下午5:31\n" +
                 "2018年9月8日 下午6:31\n" +
                 "2018年9月8日 下午9:38\n" +
                 "2018年9月9日 上午10:34\n" +
                 "2018年9月9日 上午10:37\n" +
                 "2018年9月9日 下午12:08\n" +
                 "2018年9月9日 下午1:56\n" +
                 "2018年9月9日 下午4:09\n" +
                 "2018年9月9日 下午5:56\n" +
                 "2018年9月7日 下午10:02\n" +
                 "2018年9月7日 下午10:52\n" +
                 "2018年9月7日 下午11:38\n" +
                 "2018年9月8日 上午11:58\n" +
                 "2018年9月8日 下午1:02\n" +
                 "2018年9月8日 下午6:37\n" +
                 "2018年9月9日 上午10:41\n" +
                 "2018年9月9日 上午11:04\n" +
                 "2018年9月9日 下午5:54\n" +
                 "2018年9月9日 下午11:24\n" +
                 "2018年9月6日 下午8:22\n" +
                 "2018年9月7日 下午10:12\n" +
                 "2018年9月8日 下午3:16\n" +
                 "2018年9月9日 下午4:16\n" +
                 "2018年9月9日 下午11:19\n" +
                 "2018年9月7日 下午10:21\n" +
                 "2018年9月7日 下午11:54\n" +
                 "2018年9月8日 下午9:48\n" +
                 "2018年9月8日 下午10:11\n" +
                 "2018年9月9日 上午10:37\n" +
                 "2018年9月9日 上午11:29\n" +
                 "2018年9月9日 下午12:57\n" +
                 "2018年9月9日 下午11:22\n" +
                 "2018年9月9日 上午10:24\n" +
                 "2018年9月9日 上午11:18\n" +
                 "2018年9月9日 下午2:24\n" +
                 "2018年9月9日 下午3:30\n" +
                 "2018年9月9日 下午4:09\n" +
                 "2018年9月9日 下午5:16\n" +
                 "2018年9月9日 下午2:23\n" +
                 "2018年9月9日 下午3:37\n" +
                 "2018年9月9日 下午4:15\n" +
                 "2018年9月9日 下午7:57\n" +
                 "2018年9月9日 下午4:13\n" +
                 "2018年9月9日 下午5:18\n" +
                 "2018年9月9日 下午7:25\n" +
                 "2018年9月9日 下午7:55\n" +
                 "2018年9月9日 下午11:11\n" +
                 "2018年9月6日 下午9:11\n" +
                 "2018年9月7日 上午10:38\n" +
                 "2018年9月7日 下午8:08\n" +
                 "2018年9月7日 下午10:08\n" +
                 "2018年9月7日 下午11:10\n" +
                 "2018年9月8日 上午12:15\n" +
                 "2018年9月8日 下午1:11\n" +
                 "2018年9月8日 下午2:03\n" +
                 "2018年9月8日 下午6:35\n" +
                 "2018年9月8日 下午6:42\n" +
                 "2018年9月8日 下午9:42\n" +
                 "2018年9月9日 上午10:20\n" +
                 "2018年9月9日 上午10:42\n" +
                 "2018年9月9日 下午7:34\n" +
                 "2018年9月7日 下午10:24\n" +
                 "2018年9月7日 下午11:06\n" +
                 "2018年9月8日 上午12:49\n" +
                 "2018年9月8日 下午1:27\n" +
                 "2018年9月8日 下午1:43\n" +
                 "2018年9月8日 下午5:03\n" +
                 "2018年9月8日 下午5:56\n" +
                 "2018年9月8日 下午9:49\n" +
                 "2018年9月9日 下午4:25\n" +
                 "2018年9月9日 下午7:32\n" +
                 "2018年9月9日 下午11:27\n" +
                 "2018年9月8日 下午1:41\n" +
                 "2018年9月8日 下午2:42\n" +
                 "2018年9月8日 下午5:16\n" +
                 "2018年9月8日 下午6:26\n" +
                 "2018年9月8日 下午6:55\n" +
                 "2018年9月8日 下午10:01\n" +
                 "2018年9月9日 上午9:49\n" +
                 "2018年9月9日 下午11:41\n" +
                 "2018年9月9日 下午2:01\n" +
                 "2018年9月9日 下午5:57\n" +
                 "2018年9月9日 下午6:29\n" +
                 "2018年9月7日 上午10:30\n" +
                 "2018年9月7日 上午10:47\n" +
                 "2018年9月7日 下午10:04\n" +
                 "2018年9月8日 下午12:54\n" +
                 "2018年9月8日 下午2:01\n" +
                 "2018年9月8日 下午3:13\n" +
                 "2018年9月8日 下午5:27\n" +
                 "2018年9月8日 下午6:00\n" +
                 "2018年9月8日 下午6:18\n" +
                 "2018年9月9日 上午10:15\n" +
                 "2018年9月9日 上午10:41\n" +
                 "2018年9月9日 下午6:26\n" +
                 "2018年9月9日 上午10:25\n" +
                 "2018年9月9日 上午11:12\n" +
                 "2018年9月9日 下午12:32\n" +
                 "2018年9月9日 下午1:15\n" +
                 "2018年9月9日 下午3:45\n" +
                 "2018年9月9日 下午4:22\n" +
                 "2018年9月9日 下午6:48\n" +
                 "2018年9月9日 下午1:49\n" +
                 "2018年9月9日 下午3:53\n" +
                 "2018年9月9日 下午10:14\n" +
                 "2018年9月9日 下午11:35\n" +
                 "2018年9月8日 下午6:39\n" +
                 "2018年9月8日 下午6:48\n" +
                 "2018年9月8日 下午6:51\n" +
                 "2018年9月8日 下午9:35\n" +
                 "2018年9月8日 下午9:59\n" +
                 "2018年9月8日 下午10:04\n" +
                 "2018年9月9日 上午12:24\n" +
                 "2018年9月9日 上午10:31\n" +
                 "2018年9月9日 下午2:10\n" +
                 "2018年9月9日 下午7:29\n" +
                 "2018年9月9日 下午7:58\n" +
                 "2018年9月9日 下午11:16\n" +
                 "2018年9月7日 下午7:55\n" +
                 "2018年9月7日 下午10:06\n" +
                 "2018年9月7日 下午10:56\n" +
                 "2018年9月8日 上午12:17\n" +
                 "2018年9月8日 下午1:33\n" +
                 "2018年9月8日 下午1:51\n" +
                 "2018年9月8日 下午5:50\n" +
                 "2018年9月8日 下午9:37\n" +
                 "2018年9月9日 上午10:39\n" +
                 "2018年9月9日 下午7:39\n" +
                 "2018年9月8日 下午6:49\n" +
                 "2018年9月8日 下午9:46\n" +
                 "2018年9月9日 上午10:29\n" +
                 "2018年9月9日 上午10:29\n" +
                 "2018年9月9日 上午11:52\n" +
                 "2018年9月9日 下午12:48\n" +
                 "2018年9月9日 下午5:58\n" +
                 "2018年9月9日 下午11:14\n" +
                 "2018年9月9日 下午11:14\n" +
                 "2018年9月9日 下午11:38\n" +
                 "2018年9月8日 下午3:12\n" +
                 "2018年9月8日 下午3:34\n" +
                 "2018年9月8日 下午5:07\n" +
                 "2018年9月8日 下午5:20\n" +
                 "2018年9月8日 下午5:20\n" +
                 "2018年9月8日 下午6:28\n" +
                 "2018年9月8日 下午7:01\n" +
                 "2018年9月8日 下午9:46\n" +
                 "2018年9月8日 下午11:05\n" +
                 "2018年9月9日 上午9:39\n" +
                 "2018年9月9日 上午10:35\n" +
                 "2018年9月9日 下午1:5\n" +
                 "2018年9月9日 下午3:14\n" +
                 "2018年9月9日 下午4:02\n" +
                 "2018年9月9日 下午4:08\n" +
                 "2018年9月9日 下午7:38\n" +
                 "2018年9月9日 下午7:56\n" +
                 "2018年9月9日 下午10:53\n" +
                 "2018年9月9日 下午11:40\n" +
                 "2018年9月9日 上午10:26\n" +
                 "2018年9月9日 下午12:05\n" +
                 "2018年9月9日 下午6:00\n" +
                 "2018年9月9日 下午7:36\n" +
                 "2018年9月9日 下午4:08\n" +
                 "2018年9月9日 下午6:44\n" +
                 "2018年9月9日 下午7:45\n" +
                 "2018年9月9日 下午8:05\n" +
                 "2018年9月9日 下午10:53\n" +
                 "2018年9月8日 下午1:04\n" +
                 "2018年9月8日 下午2:59\n" +
                 "2018年9月8日 下午4:03\n" +
                 "2018年9月8日 下午5:48\n" +
                 "2018年9月8日 下午11:22\n" +
                 "2018年9月8日 下午11:44\n" +
                 "2018年9月9日 上午9:52\n" +
                 "2018年9月9日 下午11:41\n" +
                 "2018年9月9日 上午10:37\n" +
                 "2018年9月9日 下午1:27\n" +
                 "2018年9月9日 下午3:03\n" +
                 "2018年9月9日 下午5:42\n" +
                 "2018年9月9日 下午6:46\n" +
                 "2018年9月9日 下午11:03\n" +
                 "2018年9月9日 下午9:06\n" +
                 "2018年9月9日 下午10:13\n" +
                 "2018年9月9日 下午10:37\n" +
                 "2018年9月9日 下午11:08\n" +
                 "2018年9月9日 下午10:22\n" +
                 "2018年9月9日 下午3:10\n" +
                 "2018年9月9日 下午10:58\n" +
                 "2018年9月9日 上午10:21\n" +
                 "2018年9月9日 上午11:54\n" +
                 "2018年9月9日 下午12:39\n" +
                 "2018年9月9日 下午1:10\n" +
                 "2018年9月9日 下午2:02\n" +
                 "2018年9月9日 下午2:57\n" +
                 "2018年9月9日 下午5:45\n" +
                 "2018年9月9日 下午5:54\n" +
                 "2018年9月9日 下午7:54\n" +
                 "2018年9月9日 下午10:47\n" +
                 "2018年9月9日 下午11:18\n" +
                 "2018年9月9日 下午11:18\n" +
                 "2018年9月9日 下午10:34\n" +
                 "2018年9月9日 上午11:56\n" +
                 "2018年9月9日 下午12:03\n" +
                 "2018年9月9日 下午12:52\n" +
                 "2018年9月9日 下午1:56\n" +
                 "2018年9月9日 下午2:58\n" +
                 "2018年9月9日 下午4:22\n" +
                 "2018年9月9日 下午5:33\n" +
                 "2018年9月9日 下午7:13\n" +
                 "2018年9月9日 下午7:27\n" +
                 "2018年9月9日 下午10:55\n" +
                 "2018年9月9日 下午12:29\n" +
                 "2018年9月9日 下午12:38\n" +
                 "2018年9月9日 下午12:55\n" +
                 "2018年9月9日 下午1:31\n" +
                 "2018年9月9日 下午1:59\n" +
                 "2018年9月9日 下午4:21\n" +
                 "2018年9月9日 下午5:37\n" +
                 "2018年9月9日 下午5:43\n" +
                 "2018年9月9日 下午6:08\n" +
                 "2018年9月9日 下午6:55\n" +
                 "2018年9月9日 下午7:48\n" +
                 "2018年9月9日 下午10:51\n" +
                 "2018年9月9日 下午11:33\n" +
                 "2018年9月9日 上午10:27\n" +
                 "2018年9月9日 上午10:31\n" +
                 "2018年9月9日 上午11:57\n" +
                 "2018年9月9日 下午12:16\n" +
                 "2018年9月9日 下午12:27\n" +
                 "2018年9月9日 下午12:49\n" +
                 "2018年9月9日 下午12:56\n" +
                 "2018年9月9日 下午12:58\n" +
                 "2018年9月9日 下午2:54\n" +
                 "2018年9月9日 下午3:20\n" +
                 "2018年9月9日 下午4:24\n" +
                 "2018年9月9日 下午5:35\n" +
                 "2018年9月9日 下午5:39\n" +
                 "2018年9月9日 下午11:16\n" +
                 "2018年9月8日 下午12:42\n" +
                 "2018年9月8日 下午2:48\n" +
                 "2018年9月8日 下午3:20\n" +
                 "2018年9月8日 下午5:35\n" +
                 "2018年9月9日 下午1:00\n" +
                 "2018年9月8日 下午6:06\n" +
                 "2018年9月8日 下午10:32\n" +
                 "2018年9月9日 上午12:14\n" +
                 "2018年9月9日 上午9:53\n" +
                 "2018年9月9日 下午11:40\n" +
                 "2018年9月9日 上午10:52\n" +
                 "2018年9月9日 上午11:51\n" +
                 "2018年9月9日 下午12:35\n" +
                 "2018年9月9日 下午1:50\n" +
                 "2018年9月9日 下午3:04\n" +
                 "2018年9月9日 下午5:47\n" +
                 "2018年9月9日 下午6:01\n" +
                 "2018年9月9日 下午6:48\n" +
                 "2018年9月9日 下午7:08\n" +
                 "2018年9月9日 上午12:26\n" +
                 "2018年9月8日 下午3:47\n" +
                 "2018年9月8日 下午6:09\n" +
                 "2018年9月8日 下午10:37\n" +
                 "2018年9月8日 下午11:01\n" +
                 "2018年9月9日 上午10:29\n" +
                 "2018年9月9日 上午10:50\n" +
                 "2018年9月9日 下午1:19\n" +
                 "2018年9月9日 下午3:15\n" +
                 "2018年9月9日 下午5:59\n" +
                 "2018年9月9日 下午6:16\n" +
                 "2018年9月9日 下午11:23\n" +
                 "2018年9月9日 上午10:00\n" +
                 "2018年9月9日 下午3:11\n" +
                 "2018年9月9日 上午9:59\n" +
                 "2018年9月9日 上午10:19\n" +
                 "2018年9月9日 上午11:39\n" +
                 "2018年9月9日 下午12:52\n" +
                 "2018年9月9日 下午12:45\n" +
                 "2018年9月9日 下午1:12\n" +
                 "2018年9月9日 下午2:53\n" +
                 "2018年9月9日 下午2:58\n" +
                 "2018年9月9日 下午5:57\n" +
                 "2018年9月9日 下午6:17\n" +
                 "2018年9月9日 下午7:00\n" +
                 "2018年9月9日 下午11:17\n" +
                 "2018年9月9日 上午10:03\n" +
                 "2018年9月9日 上午10:23\n" +
                 "2018年9月9日 上午10:27\n" +
                 "2018年9月9日 上午11:30\n" +
                 "2018年9月9日 下午12:00\n" +
                 "2018年9月9日 下午2:46\n" +
                 "2018年9月9日 下午3:18\n" +
                 "2018年9月9日 下午4:02\n" +
                 "2018年9月9日 下午5:46\n" +
                 "2018年9月9日 下午5:56\n" +
                 "2018年9月9日 下午7:16\n" +
                 "2018年9月9日 下午10:53\n" +
                 "2018年9月9日 下午6:54\n" +
                 "2018年9月9日 下午1:02\n" +
                 "2018年9月9日 下午2:22\n" +
                 "2018年9月9日 下午2:4\n" +
                 "2018年9月9日 下午2:53\n" +
                 "2018年9月9日 下午2:56\n" +
                 "2018年9月9日 下午10:31\n" +
                 "2018年9月9日 下午10:42\n" +
                 "2018年9月9日 下午11:15\n" +
                 "2018年9月9日 下午11:32\n" +
                 "2018年9月8日 下午2:57\n" +
                 "2018年9月8日 下午3:45\n" +
                 "2018年9月8日 下午3:56\n" +
                 "2018年9月8日 下午5:35\n" +
                 "2018年9月8日 下午10:03\n" +
                 "2018年9月8日 下午10:28\n" +
                 "2018年9月8日 下午11:06\n" +
                 "2018年9月8日 下午11:37\n" +
                 "2018年9月9日 上午9:43\n" +
                 "2018年9月9日 上午10:13\n" +
                 "2018年9月9日 上午10:25\n" +
                 "2018年9月9日 上午10:36\n" +
                 "2018年9月9日 上午11:35\n" +
                 "2018年9月9日 上午11:59\n" +
                 "2018年9月9日 下午3:01\n" +
                 "2018年9月9日 下午4:28\n" +
                 "2018年9月9日 下午5:40\n" +
                 "2018年9月9日 下午5:41\n" +
                 "2018年9月9日 下午6:51\n" +
                 "2018年9月9日 下午7:57\n" +
                 "2018年9月9日 下午10:50\n" +
                 "2018年9月9日 下午2:45\n" +
                 "2018年9月9日 下午3:44\n" +
                 "2018年9月9日 下午6:19\n" +
                 "2018年9月9日 下午8:29\n" +
                 "2018年9月9日 下午10:38\n" +
                 "2018年9月8日 下午2:39\n" +
                 "2018年9月8日 下午3:09\n" +
                 "2018年9月8日 下午6:25\n" +
                 "2018年9月8日 下午10:18\n" +
                 "2018年9月9日 上午9:45\n" +
                 "2018年9月9日 上午10:10\n" +
                 "2018年9月9日 下午6:49\n" +
                 "2018年9月9日 下午7:05\n" +
                 "2018年9月9日 下午7:08\n" +
                 "2018年9月9日 下午7:40\n" +
                 "2018年9月9日 下午10:39\n" +
                 "2018年9月9日 下午8:53\n" +
                 "2018年9月9日 下午9:36\n" +
                 "2018年9月9日 下午11:45\n" +
                 "2018年9月7日 下午11:00\n" +
                 "2018年9月7日 下午11:33\n" +
                 "2018年9月8日 下午12:50\n" +
                 "2018年9月8日 下午1:21\n" +
                 "2018年9月8日 下午2:41\n" +
                 "2018年9月8日 下午2:51\n" +
                 "2018年9月8日 下午2:57\n" +
                 "2018年9月8日 下午3:14\n" +
                 "2018年9月9日 上午10:37\n" +
                 "2018年9月9日 上午11:08\n" +
                 "2018年9月9日 下午12:56\n" +
                 "2018年9月9日 下午1:19\n" +
                 "2018年9月9日 下午1:41\n" +
                 "2018年9月9日 下午4:30\n" +
                 "2018年9月9日 下午6:01\n" +
                 "2018年9月9日 下午6:44\n" +
                 "2018年9月9日 下午3:23\n" +
                 "2018年9月9日 下午5:39\n" +
                 "2018年9月9日 下午7:11\n" +
                 " 2018年9月9日 下午9:43\n" +
                 "2018年9月9日 下午10:52\n" +
                 "2018年9月9日 下午11:08\n" +
                 "2018年9月8日 下午2:46\n" +
                 "2018年9月8日 下午2:51\n" +
                 "2018年9月8日 下午3:45\n" +
                 "2018年9月8日 下午5:56\n" +
                 "2018年9月8日 下午10:24\n" +
                 "2018年9月9日 上午10:15\n" +
                 "2018年9月9日 上午10:41\n" +
                 "2018年9月9日 下午6:52\n" +
                 "2018年9月9日 下午7:53\n" +
                 "2018年9月6日 下午9:03\n" +
                 "2018年9月7日 下午11:56\n" +
                 "2018年9月8日 下午1:47\n" +
                 "2018年9月8日 下午2:56\n" +
                 "2018年9月8日 下午3:41\n" +
                 "2018年9月9日 上午10:34\n" +
                 "2018年9月9日 下午1:38\n" +
                 "2018年9月8日 上午10:55\n" +
                 "2018年9月8日 下午1:09\n" +
                 "2018年9月8日 下午2:46\n" +
                 "2018年9月8日 下午5:15\n" +
                 "2018年9月9日 下午1:16\n" +
                 "2018年9月8日 下午6:02\n" +
                 "\n" +
                 "2018年9月8日 下午6:13\n" +
                 "2018年9月8日 下午11:27\n" +
                 "2018年9月9日 下午1:00\n" +
                 "2018年9月9日 下午4:36\n" +
                 "2018年9月9日 下午5:44\n" +
                 "2018年9月9日 下午6:04\n" +
                 "2018年9月9日 下午6:43\n" +
                 "2018年9月9日 下午8:18\n" +
                 "2018年9月9日 下午9:46\n" +
                 "2018年9月9日 下午10:55\n" +
                 "2018年9月9日 上午10:22\n" +
                 "2018年9月9日 下午12:08\n" +
                 "2018年9月9日 下午12:50\n" +
                 "2018年9月9日 下午2:55\n" +
                 "2018年9月9日 下午2:58\n" +
                 "2018年9月9日 下午5:52\n" +
                 "2018年9月9日 下午7:50\n" +
                 "2018年9月9日 下午11:07\n" +
                 "2018年9月9日 下午4:09\n" +
                 "2018年9月9日 下午4:48\n" +
                 "2018年9月9日 下午5:26\n" +
                 "2018年9月9日 下午6:11\n" +
                 "2018年9月9日 下午10:57\n" +
                 "2018年9月9日 下午2:50\n" +
                 "2018年9月9日 下午3:07\n" +
                 "2018年9月9日 下午4:14\n" +
                 "2018年9月9日 下午5:23\n" +
                 "2018年9月9日 下午6:11\n" +
                 "2018年9月9日 下午11:11\n" +
                 "2018年9月9日 下午11:13\n" +
                 "2018年9月9日 下午4:52\n" +
                 "2018年9月9日 下午5:31\n" +
                 "2018年9月9日 下午6:10\n" +
                 "2018年9月9日 下午11:04\n" +
                 "2018年9月9日 下午11:06\n" +
                 "2018年9月8日 下午5:15\n" +
                 "2018年9月8日 下午5:16\n" +
                 "2018年9月8日 下午10:01\n" +
                 "2018年9月8日 下午10:50\n" +
                 "2018年9月8日 下午11:16\n" +
                 "2018年9月9日 上午12:30\n" +
                 "2018年9月9日 上午8:47\n" +
                 "2018年9月9日 上午9:40\n" +
                 "2018年9月9日 下午11:40\n" +
                 "2018年9月9日 上午10:10\n" +
                 "2018年9月9日 上午10:17\n" +
                 "2018年9月9日 上午11:55\n" +
                 "2018年9月9日 下午12:19\n" +
                 "2018年9月9日 下午12:24\n" +
                 "2018年9月9日 下午12:54\n" +
                 "2018年9月9日 下午3:00\n" +
                 "2018年9月9日 下午3:28\n" +
                 "2018年9月9日 下午5:40\n" +
                 "2018年9月9日 下午6:53\n" +
                 "2018年9月9日 下午10:41\n" +
                 "2018年9月9日 下午11:19\n" +
                 "2018年9月9日 下午10:34\n" +
                 "2018年9月9日 下午11:43\n" +
                 "2018年9月9日 下午4:50\n" +
                 "2018年9月9日 下午10:33\n" +
                 "2018年9月9日 下午10:40\n" +
                 "2018年9月9日 下午10:45\n" +
                 "2018年9月9日 下午11:03";
        String huiTie1Times[] =huitie1Str.split("\n");

        String huitie2 =  "2018年9月8日 上午11:52\n" +
                "\n" +
                "2018年9月8日 上午11:51\n" +
                "2018年9月8日 下午10:26\n" +
                "2018年9月8日 下午10:28\n" +
                "2018年9月8日 下午10:29\n" +
                "2018年9月8日 下午10:30\n" +
                "2018年9月8日 下午10:31\n" +
                "2018年9月8日 下午10:33\n" +
                "2018年9月8日 下午10:33\n" +
                "2018年9月8日 下午10:34\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月7日 下午11:50\n" +
                "2018年9月7日 下午11:49\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月8日 上午12:22\n" +
                "\n" +
                "2018年9月8日 下午5:01\n" +
                "2018年9月8日 下午4:59\n" +
                "2018年9月8日 下午5:03\n" +
                "\n" +
                "2018年9月7日 下午11:16\n" +
                "\n" +
                "2018年9月7日 下午11:15\n" +
                "2018年9月7日 下午11:46\n" +
                "2018年9月7日 下午11:47\n" +
                "2018年9月7日 下午11:48\n" +
                "2018年9月7日 下午11:49\n" +
                "2018年9月8日 上午12:17\n" +
                "2018年9月8日 下午9:40\n" +
                "2018年9月8日 下午9:41\n" +
                "2018年9月8日 下午9:42\n" +
                "2018年9月8日 下午9:42\n" +
                "2018年9月8日 下午9:43\n" +
                "2018年9月8日 下午9:44\n" +
                "2018年9月8日 下午9:44\n" +
                "2018年9月8日 下午9:55\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月8日 下午10:51\n" +
                "2018年9月8日 下午1:42\n" +
                "2018年9月8日 下午10:52\n" +
                "2018年9月8日 下午10:52\n" +
                "2018年9月8日 下午10:53\n" +
                "2018年9月8日 下午10:54\n" +
                "2018年9月8日 下午10:54\n" +
                "2018年9月8日 下午10:55\n" +
                "2018年9月9日 上午11:19\n" +
                "2018年9月9日 上午11:01\n" +
                "\n" +
                "2018年9月9日 下午5:28\n" +
                "2018年9月9日 下午5:28\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月8日 下午1:03\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月8日 下午2:05\n" +
                "2018年9月9日 下午3:59\n" +
                "2018年9月9日 下午4:00\n" +
                "2018年9月9日 下午4:01\n" +
                "2018年9月9日 下午4:02\n" +
                "2018年9月9日 下午4:03\n" +
                "2018年9月9日 下午4:04\n" +
                "\n" +
                "2018年9月9日 下午4:05\n" +
                "\n" +
                "\n" +
                "2018年9月8日 下午4:59\n" +
                "2018年9月8日 下午5:01\n" +
                "2018年9月8日 下午5:03\n" +
                "2018年9月8日 下午5:06\n" +
                "2018年9月8日 下午5:07\n" +
                "2018年9月8日 下午5:0\n" +
                "2018年9月8日 下午9:47\n" +
                "2018年9月8日 下午9:49\n" +
                "2018年9月8日 下午9:52\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午11:59\n" +
                "\n" +
                "2018年9月9日 下午11:58\n" +
                "\n" +
                "2018年9月9日 下午11:53\n" +
                "2018年9月9日 下午7:48\n" +
                "2018年9月9日 下午7:48\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月8日 下午5:35\n" +
                "2018年9月8日 下午5:36\n" +
                "2018年9月8日 下午5:37\n" +
                "2018年9月8日 下午5:39\n" +
                "2018年9月8日 下午5:44\n" +
                "2018年9月9日 下午12:09\n" +
                "2018年9月9日 下午12:10\n" +
                "2018年9月9日 下午12:11\n" +
                "2018年9月9日 下午12:14\n" +
                "2018年9月9日 下午12:15\n" +
                "2018年9月9日 下午12:18\n" +
                "\n" +
                "2018年9月9日 下午7:58\n" +
                "2018年9月9日 下午7:59\n" +
                "2018年9月9日 下午8:00\n" +
                "2018年9月9日 下午8:01\n" +
                "2018年9月9日 下午8:16\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午11:47\n" +
                "2018年9月9日 下午11:47\n" +
                "2018年9月9日 下午11:49\n" +
                "2018年9月9日 下午11:49\n" +
                "2018年9月9日 下午5:53\n" +
                "2018年9月9日 下午9:27\n" +
                "2018年9月9日 下午9:26\n" +
                "2018年9月9日 下午9:25\n" +
                "\n" +
                "2018年9月8日 下午2:10\n" +
                "2018年9月8日 下午3:36\n" +
                "2018年9月8日 下午5:17\n" +
                "2018年9月8日 下午6:36\n" +
                "2018年9月9日 下午5:3\n" +
                "2018年9月9日 下午5:41\n" +
                "2018年9月9日 下午5:44\n" +
                "\n" +
                "2018年9月9日 下午5:45\n" +
                "2018年9月9日 下午5:48\n" +
                "2018年9月9日 下午5:50\n" +
                "2018年9月9日 下午6:10\n" +
                "2018年9月9日 下午7:20\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午11:28\n" +
                "\n" +
                "2018年9月9日 下午11:16\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 上午11:25\n" +
                "2018年9月9日 下午12:48\n" +
                "2018年9月9日 下午12:50\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午12:45\n" +
                "2018年9月9日 下午12:41\n" +
                "2018年9月9日 下午1:11\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 上午10:40\n" +
                "\n" +
                "2018年9月9日 上午10:39\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 上午10:37\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 上午11:11\n" +
                "2018年9月8日 下午3:51\n" +
                "2018年9月9日 上午11:07\n" +
                "2018年9月9日 上午11:08\n" +
                "\n" +
                "2018年9月9日 上午11:13\n" +
                "2018年9月9日 上午11:06\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午12:32\n" +
                "\n" +
                "2018年9月9日 下午12:33\n" +
                "\n" +
                "2018年9月9日 下午3:29\n" +
                "\n" +
                "2018年9月9日 下午3:25\n" +
                "\n" +
                "2018年9月9日 下午10:25\n" +
                "2018年9月9日 下午10:27\n" +
                "2018年9月9日 下午10:33\n" +
                "\n" +
                "2018年9月9日 上午10:11\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午1:23\n" +
                "2018年9月9日 下午5:49\n" +
                "2018年9月9日 下午5:47\n" +
                "2018年9月9日 下午5:46\n" +
                "2018年9月9日 下午5:49\n" +
                "2018年9月9日 下午10:42\n" +
                "2018年9月9日 下午10:57\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午2:47\n" +
                "2018年9月9日 下午6:39\n" +
                "2018年9月9日 下午6:39\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月8日 下午9:56\n" +
                "2018年9月8日 下午10:46\n" +
                "2018年9月8日 下午10:42\n" +
                "\n" +
                "2018年9月8日 下午10:4\n" +
                "\n" +
                "2018年9月8日 下午10:43\n" +
                "2018年9月8日 下午10:44\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月7日 下午11:14\n" +
                "2018年9月9日 上午9:33\n" +
                "2018年9月9日 上午9:27\n" +
                "2018年9月9日 上午9:23\n" +
                "2018年9月9日 上午9:22\n" +
                "2018年9月9日 下午11:37\n" +
                "2018年9月9日 下午11:35\n" +
                "2018年9月9日 上午9:32\n" +
                "2018年9月9日 上午9:29\n" +
                "2018年9月9日 上午9:26\n" +
                "2018年9月9日 上午9:19\n" +
                "2018年9月9日 下午11:35\n" +
                "2018年9月9日 上午9:34\n" +
                "2018年9月9日 上午9:37\n" +
                "2018年9月9日 上午9:16\n" +
                "2018年9月9日 上午9:14\n" +
                "2018年9月9日 下午11:36\n" +
                "2018年9月9日 下午11:34\n" +
                "2018年9月9日 下午11:33\n" +
                "2018年9月9日 下午11:32\n" +
                "2018年9月9日 下午11:32\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 上午10:25\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午4:16\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午2:54\n" +
                "2018年9月9日 下午3:11\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午6:55\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午5:01\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月8日 下午5:25\n" +
                "2018年9月8日 下午5:28\n" +
                "2018年9月9日 下午1:24\n" +
                "2018年9月9日 下午1:24\n" +
                "2018年9月9日 下午1:27\n" +
                "2018年9月9日 下午1:31\n" +
                "2018年9月9日 下午1:32\n" +
                "2018年9月9日 下午1:34\n" +
                "\n" +
                "2018年9月9日 下午1:35\n" +
                "2018年9月9日 下午1:40\n" +
                "\n" +
                "2018年9月9日 下午1:42\n" +
                "2018年9月9日 下午1:42\n" +
                "2018年9月9日 下午1:44\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午10:35\n" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "2018年9月9日 下午10:54\n";
        String huiTie2Times[] = huitie2.split("\n");

        for (int i = 0; i < huiTie2Times.length ; i++) {
            String time1 = huiTie1Times[i];
            String time2 = huiTie2Times[i];

            long time11 = getLongTime(time1);
            long time22 = getLongTime(time2);

            if(time11 == 0 || time22 == 0 ){
                System.out.println("");
            }else{
                long shijianCha = time22 - time11;
                System.out.println(shijianCha/(1000*60));

            }


        }

    }

    static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 ahh:mm");
    public static long  getLongTime(String time){
        if(time == null || time.trim().equals("")){
            return  0L;
        }else{
            try {
                Date date = simpleDateFormat.parse(time.trim());
                return  date.getTime();
            } catch (ParseException e) {
                e.printStackTrace();
                return  0l;
            }
        }
    }

}
