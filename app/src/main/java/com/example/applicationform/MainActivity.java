package com.example.applicationform;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText editname, editreg , edituniversity , editbatch , editcontact , editemail , editaddr;
    Button button;
    public static final String EXTRA_NAME = "com.example.applicationform.extra.NAME";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onclick(View v) {
        Toast.makeText(this, "Please Wait", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this , ApplicationForm2.class);
        editname = findViewById(R.id.editname);
        editreg = findViewById(R.id.editreg);
        edituniversity = findViewById(R.id.edituniversity);
        editaddr = findViewById(R.id.editaddr);
        editbatch = findViewById(R.id.editbatch);
        editemail = findViewById(R.id.editemail);
        editcontact =findViewById(R.id.editcontact);
        button = findViewById(R.id.button);
        String name = editname.getText().toString();
        String university = edituniversity.getText().toString();
        String batch = editbatch.getText().toString();
        String address = editaddr.getText().toString();
        String email = editemail.getText().toString();
        String contact = editcontact.getText().toString();
        String reg = editreg.getText().toString();
        String ans = "Name : " + name + "\n\n"+"Registration No.: " + reg + "\n\n"+"University : " + university + "\n\n" +"Batch Year: " + batch + "\n\n" +"Address: "+ address + "\n\n" +
                "Email: "+email + "\n\n"+"Contact: " + contact;
        intent.putExtra(EXTRA_NAME , ans);
        startActivity(intent);
    }
}