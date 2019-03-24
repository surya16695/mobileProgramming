package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class JavaDesActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_des);

        textView = findViewById(R.id.textView_des);
        String para = "Java programming language was originally developed by Sun Microsystems which was initiated by James Gosling and released in 1995 as core component of Sun Microsystems' Java platform (Java 1.0 [J2SE]).\n" +
                "\n" +
                "The latest release of the Java Standard Edition is Java SE 8. With the advancement of Java and its widespread popularity, multiple configurations were built to suit various types of platforms. For example: J2EE for Enterprise Applications, J2ME for Mobile Applications.\n" +
                "\n" +
                "The new J2 versions were renamed as Java SE, Java EE, and Java ME respectively. Java is guaranteed to be Write Once, Run Anywhere.\n" +
                "\n" +
                "Java is −\n" +
                "\n" +
                "Object Oriented − In Java, everything is an Object. Java can be easily extended since it is based on the Object model.\n" +
                "\n" +
                "Platform Independent − Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.\n" +
                "\n" +
                "Simple − Java is designed to be easy to learn. If you understand the basic concept of OOP Java, it would be easy to master.\n" +
                "\n" +
                "Secure − With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.\n" +
                "\n" +
                "Architecture-neutral − Java compiler generates an architecture-neutral object file format, which makes the compiled code executable on many processors, with the presence of Java runtime system.\n" +
                "\n" +
                "Portable − Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable. Compiler in Java is written in ANSI C with a clean portability boundary, which is a POSIX subset.\n" +
                "\n" +
                "Robust − Java makes an effort to eliminate error prone situations by emphasizing mainly on compile time error checking and runtime checking.\n" +
                "\n" +
                "Multithreaded − With Java's multithreaded feature it is possible to write programs that can perform many tasks simultaneously. This design feature allows the developers to construct interactive applications that can run smoothly.\n" +
                "\n" +
                "Interpreted − Java byte code is translated on the fly to native machine instructions and is not stored anywhere. The development process is more rapid and analytical since the linking is an incremental and light-weight process.\n" +
                "\n" +
                "High Performance − With the use of Just-In-Time compilers, Java enables high performance.\n" +
                "\n" +
                "Distributed − Java is designed for the distributed environment of the internet.\n" +
                "\n" +
                "Dynamic − Java is considered to be more dynamic than C or C++ since it is designed to adapt to an evolving environment. Java programs can carry extensive amount of run-time information that can be used to verify and resolve accesses to objects on run-time.\"" +
                "\n" +
                "\n" +
                "\n" +
                "\n" +
                "";

        textView.setText(para);
        textView.setMovementMethod(new ScrollingMovementMethod());
        Button button =  findViewById(R.id.start);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentjavades = new Intent(JavaDesActivity.this, loginActivity.class);
                startActivity(intentjavades);
            }
        });
    }
}
