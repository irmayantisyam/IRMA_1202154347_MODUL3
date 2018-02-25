package com.example.irmayanti.irmayantisyam_1202154347_modul3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
//inisiasi
    EditText username, password;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //memasangkan id dengan variabel yang telah ditentukan, sebagai wadahnya
        username = findViewById(R.id.username);
        password = findViewById(R.id.txt_pwd);
        btnLogin = findViewById(R.id.signin);
    }

    //membuat method saat button di klik
    public void showLogin(View view) {
        if (username.getText().toString().equalsIgnoreCase("ead") && password.getText().toString().equalsIgnoreCase("mobile")){
            Toast.makeText(this, "Login Sukses", Toast.LENGTH_LONG).show(); //menampilkan pesan toast
            Intent intent = new Intent(LoginActivity.this, MainActivity.class); // membuat intent
            startActivity(intent); //memulai intent
        }else{
            Toast.makeText(this, "Username atau Password yang anda masukkan salah", Toast.LENGTH_LONG).show(); //menampilkan pesan toast
        }
    }
}
