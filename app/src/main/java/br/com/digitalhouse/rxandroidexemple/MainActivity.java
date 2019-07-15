package br.com.digitalhouse.rxandroidexemple;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import io.reactivex.Observable;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        testeRx();
    }

        private void testeRx() {

            Observable.just(100)
                    .subscribe(numero ->Log.e("TESTE","numero"+numero));

        }


}
