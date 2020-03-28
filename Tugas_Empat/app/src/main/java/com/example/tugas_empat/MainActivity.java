package com.example.tugas_empat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText NamaDepan, NamaBelakang, TempatLahir, TanggalLahir, Alamat, Telepon, Email, Password, KonfirmasiPassword;
    Button Daftar, Kembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NamaDepan = findViewById(R.id.nama_depan);
        NamaBelakang = findViewById(R.id.nama_belakang);
        TempatLahir = findViewById(R.id.tempat_lahir);
        TanggalLahir = findViewById(R.id.tanggal_lahir);
        Alamat = findViewById(R.id.alamat);
        Telepon = findViewById(R.id.telepon);
        Email = findViewById(R.id.email);
        Password = findViewById(R.id.password);
        KonfirmasiPassword = findViewById(R.id.konfirmasi_password);
        Daftar = findViewById(R.id.daftar);
        Kembali = findViewById(R.id.kembali);

        Daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (NamaDepan.length()==0)
                {
                    NamaDepan.setError("Nama Depan Harus Diisi!");
                }
                if (NamaBelakang.length()==0)
                {
                    NamaBelakang.setError("Nama Belakang Harus Diisi!");
                }
                if (TempatLahir.length()==0)
                {
                    TempatLahir.setError("Tempat Lahir Harus Diisi!");
                }
                if (TanggalLahir.length()==0)
                {
                    TanggalLahir.setError("Tanggal Lahir Harus Diisi!");
                }
                if (Alamat.length()==0)
                {
                    Alamat.setError("Alamat Harus Diisi!");
                }
                if (Telepon.length()==0)
                {
                    Telepon.setError("Nomor Telepon Harus Diisi!");
                }
                if (Email.length()==0)
                {
                    Email.setError("Email Harus Diisi!");
                }
                if (Password.length()==0)
                {
                    Password.setError("Password Harus Diisi!");
                }
                if (NamaDepan.getText().toString().length()>=1 && NamaBelakang.getText().toString().length()>=1 &&
                        TempatLahir.getText().toString().length()>=1 && TanggalLahir.getText().toString().length()>=1 &&
                        Alamat.getText().toString().length()>=1 && Telepon.getText().toString().length()>=1 &&
                        Email.getText().toString().length()>1 && Password.getText().toString().length()>1)
                {
                    Toast.makeText(MainActivity.this, "Pendaftaran Berhasil",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
