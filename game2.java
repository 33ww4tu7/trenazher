package com.example.fando.trenazher;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;



public class game2 extends Activity implements View.OnClickListener {
    public static char btnclk;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32, Button_start;
    TextView textView, textView2, textView3;
    ImageView imageView;
    final Random random = new Random();
    String str[] = {"абажур", "ажурный", "аббат", "абзац", "аббревиатура", "абитуриент", "абонемент", "абонент", "абордаж", "абориген", "абразива", "абрикос", "абсолютный", "абстракцией", "абсциссу", "абсурд", "авангардизм", "авантюрист", "авария", "авиасалон", "автобус", "автограф", "автомобиль", "автопилот", "автора", "агитатор", "агрегат", "агроном", "адаптация", "адвокат", "администрация", "адрес", "адъютант", "ажиотаж", "акваланг", "аквариум", "аккомпаниатор", "аккуратный", "акробат", "алгоритм", "аллегория", "аллея", "аллигатор", "алмаз", "альбом", "афоризма", "аферу", "аудитория", "бабочка", "багаж", "багрового", "багряный", "бадминтон", "базар", "бакалавр", "баклуши", "бактерия", "балаган", "балладе", "банан", "барьер", "бассейн", "бахромой", "башлык", "башмак", "вагон", "вакансия", "валенки", "валерьянка", "валюта", "вариант", "варьете", "вширь", "вкривь", "вкось", "величина", "габардин", "газета", "газон", "галактика", "галантерея", "галерея", "галлюцинации", "гамак", "гарантирован", "гараж", "дармоед", "двенадцать", "двадцать", "двойник", "дебаты", "дебошир", "дебют", "енот", "есаул", "еще", "жаворонком", "жаргон", "жевал", "желание", "желатин", "жестокий", "жетон", "жизнь", "жилет", "забавы", "заботы", "завод", "завтрак", "завтрашний", "заголовки", "игнорируя", "идеограмма", "идеология", "идиллия", "идиома", "идиот", "иерархия", "кабина", "кабинет", "кабриолет", "кавалерия", "кавычки", "кадастр", "каламбур", "лаборатория", "лагерь", "лагуна", "ладонь", "лазарет", "лакей", "лакомка", "ландшафт", "мавзолей", "магазин", "магистраль", "магнат", "магнитофон", "майонез", "макароны", "макияж", "наваждение", "наверное", "наводнение", "надолго", "наждака", "назад", "наизусть", "наконец", "ненастье", "необходимость", "обагрил", "обаятельный", "обвинять", "обедать", "обезьяны", "обелиска", "падеж", "павильон", "палата", "пальто", "памфлет", "памятник", "панама", "равнение", "равнина", "радость", "разгадать", "разделить", "разлагайте", "саботируй", "саквояж", "салат", "салфеткой", "салют", "санаторий", "таблетки", "табак", "талант", "тапочки", "тараторка", "тарелка", "убеждениями", "уважать", "уведомил", "увертюра", "увлекать", "угадай", "фанатик", "фанеры", "фантазия", "фантом", "фарватер", "халва", "хамелеон", "харизма", "хозяйство", "холостой", "хомут", "хорей", "хореография", "целебный", "целлофан", "целовать", "цемент", "церемония", "чабан", "чалма", "частушки", "человек", "чемодан", "чердак", "черемуха", "шалаш", "шампиньон", "шампунь", "шантаж", "шевелить", "шевелюру", "шедевр", "шепелявый", "щекотать", "щенок", "щепотка", "щетина", "эвакуация", "эвкалипт", "эволюция", "эгоизм", "экзамен", "экземпляр", "экология", "экскаватор", "экскурсия", "эксплуатация", "экспонат", "юбилей", "ювелир", "юноша", "юный", "яблоко", "ягода", "язык", "якорь", "ямщик", "январь", "ярости", "ятва", "язь"};
    int i = 0, a = 1, n_str = random.nextInt(249), atime=20000, countworld=0,counterror=0, countsymbol=0, seconds;
    char[] arr = str[n_str].toCharArray();
    char b ='а';
    LinearLayout ll1, ll2, ll3, ll6, ll7, ll8;
    String counttime;
    boolean Chek_Word = false, btnstart = false, running=false, c1boolean, c2boolean;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game2);
        ll1 = (LinearLayout) findViewById(R.id.linearLayout);
        ll2 = (LinearLayout) findViewById(R.id.linearLayout2);
        ll3 = (LinearLayout) findViewById(R.id.linearLayout3);
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
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
        imageView = (ImageView) findViewById(R.id.imageView);
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

    }

    private void findViewById(TextView textView) {
    }


    @Override
    public void onClick(View v){

        switch (v.getId()) {
            case R.id.btn1:
                btnclk = 'й';
                test();
                break;
            case R.id.btn2:
                btnclk = 'ц';
                test();
                break;
            case R.id.btn3:
                btnclk = 'у';
                test();
                break;
            case R.id.btn4:
                btnclk = 'к';
                test();
                break;
            case R.id.btn5:
                btnclk = 'е';
                test();
                break;
            case R.id.btn6:
                btnclk = 'н';
                test();
                break;
            case R.id.btn7:
                btnclk = 'г';
                test();
                break;
            case R.id.btn8:
                btnclk = 'ш';
                test();
                break;
            case R.id.btn9:
                btnclk = 'щ';
                test();
                break;
            case R.id.btn10:
                btnclk = 'з';
                test();
                break;
            case R.id.btn11:
                btnclk = 'х';
                test();
                break;
            case R.id.btn12:
                btnclk = 'ъ';
                test();
                break;
            case R.id.btn13:
                btnclk = 'ф';
                test();
                break;
            case R.id.btn14:
                btnclk = 'ы';
                test();
                break;
            case R.id.btn15:
                btnclk = 'в';
                test();
                break;
            case R.id.btn16:
                btnclk = 'а';
                test();
                break;
            case R.id.btn17:
                btnclk = 'п';
                test();
                break;
            case R.id.btn18:
                btnclk = 'р';
                test();
                break;
            case R.id.btn19:
                btnclk = 'о';
                test();
                break;
            case R.id.btn20:
                btnclk = 'л';
                test();
                break;
            case R.id.btn21:
                btnclk = 'д';
                test();
                break;
            case R.id.btn22:
                btnclk = 'ж';
                test();
                break;
            case R.id.btn23:
                btnclk = 'э';
                test();
                break;
            case R.id.btn24:
                btnclk = 'я';
                test();
                break;
            case R.id.btn25:
                btnclk = 'ч';
                test();
                break;
            case R.id.btn26:
                btnclk = 'с';
                test();
                break;
            case R.id.btn27:
                btnclk = 'м';
                test();
                break;
            case R.id.btn28:
                btnclk = 'и';
                test();
                break;
            case R.id.btn29:
                btnclk = 'т';
                test();
                break;
            case R.id.btn30:
                btnclk = 'ь';
                test();
                break;
            case R.id.btn31:
                btnclk = 'б';
                test();
                break;
            case R.id.btn32:
                btnclk = 'ю';
                test();

                break;
            case R.id.Button_start1:
                textView.setText(str[n_str]);
                Animation anim;
                anim = AnimationUtils.loadAnimation(this, R.anim.mutrans);
                anim.setDuration(atime);
                textView.startAnimation(anim);
                chektime();
                Button_start.setVisibility(View.INVISIBLE);
                btnstart = true;
                running = true;
                break;

        }
    }


    private void test() {

        if (btnstart) {
            if (i + 1 <= str[n_str].length()) {


                if (btnclk == arr[i] || btnclk == Character.toUpperCase(arr[i])) {
                    Spannable text = new SpannableString(str[n_str]);
                    text.setSpan(new StyleSpan(Typeface.ITALIC), 0, a, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    text.setSpan(new ForegroundColorSpan(Color.GREEN), 0, a, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

                    textView.setText(text);
                    i++;
                    a++;
                    countsymbol++;

                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Введена неверная буква", Toast.LENGTH_SHORT);
                    toast.setGravity(Gravity.CENTER, 0, 0);
                    toast.show();
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    v.vibrate(100);
                    counterror++;
                }

                if (counterror == 15) {
                    running=false;
                    Toast toast = Toast.makeText(getApplicationContext(), "Допущено слишком много ошибок", Toast.LENGTH_SHORT);
                    toast.show();
                    ll1.removeAllViews();
                    ll2.removeAllViews();
                    ll3.removeAllViews();
                    textView.setText(" ");
                    textView2.setText(" ");
                    textView3.setText("Кол-во слов - " + countworld+"\n" +
                            "Кол-во символов - " + countsymbol+"\n" +
                            "Кол-во ошибок - " + counterror+"\n" +
                            "Прошло времени - " + counttime);
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));

                }
                if (i == str[n_str].length()) {
                    countworld++;
                    i = 0;
                    a = 1;
                    n_str = random.nextInt(249);
                    textView.setText(str[n_str]);
                    arr = str[n_str].toCharArray();
                    textView.clearAnimation();
                    atime=atime-(str[n_str].length())*100;
                    Animation anim;
                    anim = AnimationUtils.loadAnimation(this, R.anim.mutrans);
                    anim.setDuration(atime);
                    textView.startAnimation(anim);
                    Chek_Word = true;

                }


            }
        }
        else{
            Toast toast = Toast.makeText(getApplicationContext(), "Нажмите кнопку 'Старт'", Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

    private void chektime() {
        final Handler handler = new Handler();
        final int[] ctime = {0};
        handler.post(new Runnable() {
            @Override
            public void run() {

                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secon = seconds % 60;
                final String time = String.format("%d:%02d:%02d", hours, minutes, secon);
                counttime=time;

                if(running) {
                    textView2.setText("Кол-во слов - " + countworld + " Кол-во символов - " + countsymbol + " Кол-во ошибок - " + counterror + " Прошло времени - " + counttime);
                    seconds++;
                }


                if (Chek_Word) {
                    Chek_Word = false;
                    ctime[0] = 1;

                } else {
                    ctime[0]++;
                }
                if (ctime[0] == atime / 1000) {
                    running=false;
                    ll1.removeAllViews();
                    ll2.removeAllViews();
                    ll3.removeAllViews();
                    textView.setText(" ");
                    textView2.setText(" ");
                    textView3.setText("Кол-во слов - " + countworld+"\n" +
                            "Кол-во символов - " + countsymbol+"\n" +
                            "Кол-ва ошибок - " + counterror+"\n" +
                            "Прошло времени - " + counttime);

                }

                handler.postDelayed(this, 1000);
            }

        });
    }




}