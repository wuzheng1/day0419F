package com.lgx.day0221;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int a = 0;
       /* ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName("李桂啸"+i);
            student.setClasses("Java"+i);
            students.add(student);
        }

         Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()){
            Student next = iterator.next();
            Log.d("lili", "onCreate: "+next.getName()+next.getClasses());
        }*/


        HashSet<Student> students = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setName("李桂啸"+i);
            student.setClasses("Java"+i);
            students.add(student);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Iterator<Student> iterator = students.iterator();
        boolean b = iterator.hasNext();
        while (b){
            Student next = iterator.next();
            Log.d("lili", "onCreate: "+next.getName()+next.getClasses());
        }


    }
}
