package com.example.fando.trenazher;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class game1 extends Activity implements View.OnClickListener {
    final Random random = new Random();
    String[] arr = {"Й", "Ц", "У", "К", "Е", "Н", "Г", "Ш", "Щ", "З", "Х", "Ъ", "Ф", "Ы", "В", "А", "П", "Р", "О", "Л", "Д", "Ж", "Э", "Я", "Ч", "С", "М", "И", "Т", "Ь", "Б", "Ю"};
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32, Button_start;
    TextView textView;
    int irandom, btnclk;
    String srandom;
    CheckBox CheckBox, CheckBox2;
    Boolean btnstart = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game1);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btn10 = (Button) findViewById(R.id.btn10);
        btn11 = (Button) findViewById(R.id.btn11);
        btn12 = (Button) findViewById(R.id.btn12);
        btn13 = (Button) findViewById(R.id.btn13);
        btn14 = (Button) findViewById(R.id.btn14);
        btn15 = (Button) findViewById(R.id.btn15);
        btn16 = (Button) findViewById(R.id.btn16);
        btn17 = (Button) findViewById(R.id.btn17);
        btn18 = (Button) findViewById(R.id.btn18);
        btn19 = (Button) findViewById(R.id.btn19);
        btn20 = (Button) findViewById(R.id.btn20);
        btn21 = (Button) findViewById(R.id.btn21);
        btn22 = (Button) findViewById(R.id.btn22);
        btn23 = (Button) findViewById(R.id.btn23);
        btn24 = (Button) findViewById(R.id.btn24);
        btn25 = (Button) findViewById(R.id.btn25);
        btn26 = (Button) findViewById(R.id.btn26);
        btn27 = (Button) findViewById(R.id.btn27);
        btn28 = (Button) findViewById(R.id.btn28);
        btn29 = (Button) findViewById(R.id.btn29);
        btn30 = (Button) findViewById(R.id.btn30);
        btn31 = (Button) findViewById(R.id.btn31);
        btn32 = (Button) findViewById(R.id.btn32);
        textView = (TextView) findViewById(R.id.textView);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
        btn7.setOnClickListener(this);
        btn8.setOnClickListener(this);
        btn9.setOnClickListener(this);
        btn10.setOnClickListener(this);
        btn11.setOnClickListener(this);
        btn12.setOnClickListener(this);
        btn13.setOnClickListener(this);
        btn14.setOnClickListener(this);
        btn15.setOnClickListener(this);
        btn16.setOnClickListener(this);
        btn17.setOnClickListener(this);
        btn18.setOnClickListener(this);
        btn19.setOnClickListener(this);
        btn20.setOnClickListener(this);
        btn21.setOnClickListener(this);
        btn22.setOnClickListener(this);
        btn23.setOnClickListener(this);
        btn24.setOnClickListener(this);
        btn25.setOnClickListener(this);
        btn26.setOnClickListener(this);
        btn27.setOnClickListener(this);
        btn28.setOnClickListener(this);
        btn29.setOnClickListener(this);
        btn30.setOnClickListener(this);
        btn31.setOnClickListener(this);
        btn32.setOnClickListener(this);
        Button_start = (Button) findViewById(R.id.Button_start1);
        Button_start.setOnClickListener(this);
        CheckBox = (CheckBox) findViewById(R.id.checkBox);
        CheckBox.setOnClickListener(this);
        CheckBox2 = (CheckBox) findViewById(R.id.checkBox2);
        CheckBox2.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.image);
        switch (v.getId()) {
            case R.id.btn1:
                btnclk = 0;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a1)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn2:
                btnclk = 1;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a2)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn3:
                btnclk = 2;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a3)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn4:
                btnclk = 3;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a4)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn5:
                btnclk = 4;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a5)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn6:
                btnclk = 5;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a6)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn7:
                btnclk = 6;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a7)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn8:
                btnclk = 7;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a8)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn9:
                btnclk = 8;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a9)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn10:
                btnclk = 9;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a10)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn11:
                btnclk = 10;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a11)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn12:
                btnclk = 11;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a12)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn13:
                btnclk = 12;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a13)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn14:
                btnclk = 13;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a14)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn15:
                btnclk = 14;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a15)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn16:
                btnclk = 15;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a16)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn17:
                btnclk = 16;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a17)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn18:
                btnclk = 17;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a18)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn19:
                btnclk = 18;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a19)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn20:
                btnclk = 19;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a20)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn21:
                btnclk = 20;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a21)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn22:
                btnclk = 21;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a23)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn23:
                btnclk = 22;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a22)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn24:
                btnclk = 23;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a24)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn25:
                btnclk = 24;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a25)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn26:
                btnclk = 25;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a26)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn27:
                btnclk = 26;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a27)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn28:
                btnclk = 27;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a28)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn29:
                btnclk = 28;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a29)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn30:
                btnclk = 29;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a30)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn31:
                btnclk = 30;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a31)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.btn32:
                btnclk = 31;
                if (btnclk == irandom)
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.a32)));
                else
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                test();
                break;
            case R.id.checkBox:
                if (CheckBox.isChecked()) {
                    btn1.setText(" ");
                    btn1.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn3.setText(" ");
                    btn3.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn5.setText(" ");
                    btn5.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn7.setText(" ");
                    btn7.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn10.setText(" ");
                    btn10.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn14.setText(" ");
                    btn14.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn16.setText(" ");
                    btn16.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn18.setText(" ");
                    btn18.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn20.setText(" ");
                    btn20.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn22.setText(" ");
                    btn22.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn24.setText(" ");
                    btn24.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn26.setText(" ");
                    btn26.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn29.setText(" ");
                    btn29.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn32.setText(" ");
                    btn32.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    CheckBox2.setChecked(false);
                    CheckBox2.setVisibility(View.INVISIBLE);
                } else {
                    btn1.setText("й");
                    btn1.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn3.setText("у");
                    btn3.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn5.setText("е");
                    btn5.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn7.setText("г");
                    btn7.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn10.setText("з");
                    btn10.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn14.setText("ы");
                    btn14.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn16.setText("а");
                    btn16.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn18.setText("р");
                    btn18.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn20.setText("л");
                    btn20.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn22.setText("ж");
                    btn22.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn24.setText("я");
                    btn24.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn26.setText("с");
                    btn26.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn29.setText("т");
                    btn29.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn32.setText("ю");
                    btn32.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    CheckBox2.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.checkBox2:
                if (CheckBox2.isChecked()) {
                    btn2.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn2.setText(" ");
                    btn4.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn4.setText(" ");
                    btn6.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn6.setText(" ");
                    btn8.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn8.setText(" ");
                    btn9.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn9.setText(" ");
                    btn11.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn11.setText(" ");
                    btn12.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn12.setText(" ");
                    btn13.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn13.setText(" ");
                    btn15.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn15.setText(" ");
                    btn17.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn17.setText(" ");
                    btn19.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn19.setText(" ");
                    btn21.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn21.setText(" ");
                    btn23.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn23.setText(" ");
                    btn25.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn25.setText(" ");
                    btn27.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn27.setText(" ");
                    btn28.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn28.setText(" ");
                    btn30.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn30.setText(" ");
                    btn31.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn31.setText(" ");
                    btn1.setText(" ");
                    btn1.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn3.setText(" ");
                    btn3.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn5.setText(" ");
                    btn5.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn7.setText(" ");
                    btn7.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn10.setText(" ");
                    btn10.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn14.setText(" ");
                    btn14.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn16.setText(" ");
                    btn16.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn18.setText(" ");
                    btn18.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn20.setText(" ");
                    btn20.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn22.setText(" ");
                    btn22.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn24.setText(" ");
                    btn24.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn26.setText(" ");
                    btn26.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn29.setText(" ");
                    btn29.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    btn32.setText(" ");
                    btn32.setBackground(getResources().getDrawable(R.drawable.buttonshape));
                    CheckBox.setChecked(false);
                    CheckBox.setVisibility(View.INVISIBLE);
                } else {
                    btn1.setText("й");
                    btn1.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn2.setText("ц");
                    btn2.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn3.setText("у");
                    btn3.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn4.setText("к");
                    btn4.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn5.setText("е");
                    btn5.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn6.setText("н");
                    btn6.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn7.setText("г");
                    btn7.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn8.setText("ш");
                    btn8.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn9.setText("щ");
                    btn9.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn10.setText("з");
                    btn10.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn11.setText("х");
                    btn11.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn12.setText("ъ");
                    btn12.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn13.setText("ф");
                    btn13.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn14.setText("ы");
                    btn14.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn15.setText("в");
                    btn15.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn16.setText("а");
                    btn16.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn17.setText("п");
                    btn17.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn18.setText("р");
                    btn18.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn19.setText("о");
                    btn19.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn20.setText("л");
                    btn20.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn21.setText("д");
                    btn21.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn22.setText("ж");
                    btn22.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn23.setText("э");
                    btn23.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn24.setText("я");
                    btn24.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn25.setText("ч");
                    btn25.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn26.setText("с");
                    btn26.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn27.setText("м");
                    btn27.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn28.setText("и");
                    btn28.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn29.setText("т");
                    btn29.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn30.setText("ь");
                    btn30.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn31.setText("б");
                    btn31.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    btn32.setText("ю");
                    btn32.setBackground(getResources().getDrawable(android.R.drawable.btn_default));
                    CheckBox.setVisibility(View.VISIBLE);
                }

                break;
            case R.id.Button_start1:
                btnstart = true;
                textView.setText("Слово");
                irandom = random.nextInt(32);
                srandom = arr[irandom];
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Введите букву - " + srandom);
                Button start = (Button) findViewById(R.id.Button_start1);
                start.setVisibility(View.INVISIBLE);
                break;

        }
    }


    private void test() {
        if (btnstart) {
            if (btnclk == irandom) {

                Toast toast = Toast.makeText(getApplicationContext(), "Верно", Toast.LENGTH_SHORT);
                toast.show();
                irandom = random.nextInt(32);
                srandom = arr[irandom];
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("Введите букву - " + srandom);

            } else {
                Toast toast = Toast.makeText(getApplicationContext(), "Введена неверная буква", Toast.LENGTH_SHORT);
                toast.show();
                Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                v.vibrate(300);
            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Нажмите кнопку 'Старт'", Toast.LENGTH_SHORT);
            toast.show();
        }

    }


}



