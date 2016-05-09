# trungnt-android3-assignment9

##Làm quen Activity Stack
Làm quen với Activity stack: ta tạo 10 activity từ 1 -> 10. 
Theo thứ tự:
- Activity1 có button ấn vào mở Activity2
- Activity2 có button ấn vào mở Activity3
  cho đến:
- Activity10 có button ấn vào mở Activity1 và xoá toàn bộ các Acvity từ 2-10 khỏi stack

![Learn Activity - Back Stack](http://i477.photobucket.com/albums/rr132/trungepu/Fragment%20back-stack_zps2ri1eeab.jpg)

##Chú ý khi code:
+ Trong Manifest.xml, ta cấu hình cho các Activty launch mode ở chế độ android:launchMode="singleTop" (từ MainActivity1 đến Activity10). Chế độ singleTop có tác dụng khi ta click vào nút Back của máy điện thoại Android thì Acitivty không tạo mới nữa, nó sẽ lấy Activity cũ đã tồn tại và cho lên top của Stack (vào trước ra sau), 
```
<activity android:name=".Activity2" android:launchMode="singleTop">
        </activity>
```

Khi nhấn nút Open Activity1 của Activity10, ta cho mở Activity 1 trong giao diện Actvity 10 và đánh dấu Activty 1 đưa lên đỉnh Top của Stack, sau đó Xóa toàn bộ Activity có trên nó bằng cờ Flag: Intent.FLAG_ACTIVITY_CLEAR_TOP
```
Button btnOpenActivity = (Button) this.findViewById(R.id.btnAcitivy10);
        btnOpenActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Activity10.this, MainActivity1.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
```

##Môi trường phát triển
+ Hệ điều hành Android 5.0 - api 21
+ Máy ảo avd sử dụng Api 21


##Tham khảo
+ [Task and Back Stack](http://developer.android.com/guide/components/tasks-and-back-stack.html)
+ [How to clear all activity stack in Android](http://tips.androidhive.info/2013/10/how-to-clear-all-activity-stack-in-android/)
+ [Tìm hiểu Launch Mode của Activity trong Android](https://inthecheesefactory.com/blog/understand-android-activity-launchmode/en)
+ [Navigation and Task Stack](https://guides.codepath.com/android/Navigation-and-Task-Stacks)
+ [Managin acitivity back stack](http://www.slideshare.net/rajdeep/managing-activity-backstack)
+ [android activities and tasks series intent flag](https://blog.akquinet.de/2010/04/15/android-activites-and-tasks-series-intent-flags/)
+ [Clear activity stack](http://www.lucas-dev.com/blog/entry/clear-activity-stack.html)
+ [Remove and Adding Activities  to the back stack](http://stackoverflow.com/questions/20241544/removing-and-adding-activities-to-the-back-stack)
+ [Back Stack](https://binhvova.wordpress.com/category/android/)
+ [FLAG_ACTIVITY_CLEAR_TOP in Android](http://developer.android.com/reference/android/content/Intent.html#FLAG_ACTIVITY_CLEAR_TOP)
+ [use Intent in Android](http://developer.android.com/reference/android/content/Intent.html)

