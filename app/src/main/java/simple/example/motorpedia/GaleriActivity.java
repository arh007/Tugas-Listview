package simple.example.motorpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.motorpedia.model.Motor;

public class GaleriActivity extends AppCompatActivity {

    Motor motor;
    TextView txBrand,txMerek,txCc,txDeskripsi;
    ImageView ivFotoMotor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_brand);
        Intent intent = getIntent();
        motor = (Motor) intent.getSerializableExtra(DaftarMotorActivity.MOTOR_TERPILIH);
        inisialisasiView();
        tampilkanProfil(motor);
    }

    private void inisialisasiView() {

        txBrand = findViewById(R.id.txBrand);
        txMerek = findViewById(R.id.txMerek);
        txCc = findViewById(R.id.txCc);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoMotor = findViewById(R.id.gambarMotor);
    }


    private void tampilkanProfil(Motor motor) {
        Log.d("HONDA","Menampilkan honda "+motor.getMerek());
        txBrand.setText(motor.getBrand());
        txMerek.setText(motor.getMerek());
        txCc.setText(motor.getCc());
        txDeskripsi.setText(motor.getDeskripsi());
        ivFotoMotor.setImageDrawable(this.getDrawable(motor.getDrawableRes()));
    }
}