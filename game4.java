package com.example.fando.trenazher;

import android.app.Activity;
import android.content.Context;
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
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;


public class game4 extends Activity implements View.OnClickListener {
    public static char btnclk;
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16, btn17, btn18, btn19, btn20, btn21, btn22, btn23, btn24, btn25, btn26, btn27, btn28, btn29, btn30, btn31, btn32, btn33, btn34, btn35, btn36, btn37, btn38, btn39, Button_start1, Button_start2,Button_start3,Button_start4, Button_start5;
    TextView textView, textView2, textView3;
    ImageView imageView;
    int i = 0, a = 1, n_str = 0, countworld = 0, countsymbol = 0, counterror = 0, seconds, speedw=0;
    long speed;
 String str[] = {"Когда человек сознательно или интуитивно выбирает себе в жизни какую-то цель, жизненную задачу, он невольно дает себе оценку. По тому, ради чего человек живет, можно судить и о его самооценке - низкой или высокой. Если человек живет, чтобы приносить людям добро, облегчать их страдания, давать людям радость, то он оценивает себя на уровне этой своей человечности. Он ставит себе цель, достойную человека. Только такая цель позволяет человеку прожить свою жизнь с достоинством и получить настоящую радость. Да, радость. Подумайте: если человек ставит себе задачей увеличивать в жизни добро, приносить людям счастье, какие неудачи могут его постигнуть? Не тому помочь? Но много ли людей не нуждаются в помощи? Если жить только для себя, своими мелкими заботами о собственном благополучии, то от прожитого не останется и следа. Если же жить для других, то другие сберегут то, чему служил, чему отдавал силы. Можно по-разному определять цель своего существования, но цель должна быть. Надо иметь и принципы в жизни. Одно правило в жизни должно быть у каждого человека, в его цели жизни, в его принципах жизни, в его поведении: надо прожить жизнь с достоинством, чтобы не стыдно было вспоминать. Достоинство требует доброты, великодушия, умения не быть эгоистом, быть правдивым, хорошим другом, находить радость в помощи другим. Ради достоинства жизни надо уметь отказываться от мелких удовольствий и немалых тоже… Уметь извиняться, признавать перед другими ошибку - лучше, чем врать. Обманывая, человек прежде всего обманывает самого себя, ибо он думает, что успешно соврал, а люди поняли и из деликатности промолчали. Жизнь - прежде всего творчество, но это не значит, что каждый человек, чтобы жить, должен родиться художником, балериной или ученым. Можно творить просто добрую атмосферу вокруг себя. Человек может принести с собой атмосферу подозрительности, какого-то тягостного молчания, а может внести сразу радость, свет. Вот это и есть творчество.",
            "Одни люди, если сделают кому-нибудь услугу, ждут себе за это награду или благодарность. Другие, может и не ждут награды и благодарности, но всё-таки не забывают того, что они сделали. А потому считают тех, кому они сделали добро, своими должниками. Но истинное, настоящее добро - добро только тогда, когда оно сделано не для другого, а для себя. Когда человек, который сделал добро, не ищет награды. Он делает добро так, как плодовое дерево, когда оно вырастит свои плоды, довольно тем, что плодами этими пользуются те, кому они нужны.",
            "В Европе хитрый человек называется лисицей. Я был в Индии, там хитрого человека называют шакалом. Я был в Африке, там его называют змеёй. Вне зависимости от басен человека называют быком, козлом, ослом, теленком, зайцем, орлом, ласточкой. Почему это так? Почему животные, их повадки, их характеристики, их внешний образ становятся определениями характера человека? Да потому, что человек ощущает себя частью природы, частью всего, что живет на Земле. Без этого ему и холодно, и неуютно.",
            "Когда я был маленький, я очень любил мороженое. Конечно, я его и сейчас люблю. Но тогда это было что-то особенное - так я любил мороженое. И когда, например, ехал по улице мороженщик со своей тележкой, у меня прямо начиналось головокружение: до того мне хотелось покушать то, что продавал мороженщик. И моя сестрёнка Леля тоже исключительно любила мороженое.",
            "Я - Серый. Я серый, как мышонок. Как птица, как пепел, как пыль. Я - Серый, но чтобы делали без меня яркие! Где я? Повсюду. Вот растаял снег. Обнажилась земля. Серо вокруг, скучно. Весна пока что серая. Но вот лопнула серенькая скромная почка. Разве она была бы так хороша и зелена, если б я не был таким серым? Вот вылезает из серой земли тюльпан. А вот и ревень высовывает свои красные, как у чёрта, рога! В серых сумерках плывут над лугом белые простыни тумана. В сером поднебесье восходит красное солнышко. И все видят, как прекрасно оно. Я - Серый. И я прихожу раньше всех красок, которых ждут люди. Серым утром они ждут солнца. Серой ночью - месяц. Серой весной - цветы. Серой осенью - снег. Я - важный цвет. Потому что всё становится красивым рядом со мной. Я помогаю краскам. А если они не могут явиться сами, то выталкиваю их из себя. Пускай все глядят. Из серой тучи я выталкиваю радугу."};
    String counttime;
    char[] arr = str[n_str].toCharArray();
    boolean btnstart = false, running=false;
    LinearLayout ll1, ll2, ll3, ll4, ll5;
    ScrollView scr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game4);
        ll1 = (LinearLayout) findViewById(R.id.linearLayout);
        ll2 = (LinearLayout) findViewById(R.id.linearLayout2);
        ll3 = (LinearLayout) findViewById(R.id.linearLayout3);
        ll4 = (LinearLayout) findViewById(R.id.linearLayout4);
        ll5 = (LinearLayout) findViewById(R.id.linearLayout5);
        scr = (ScrollView) findViewById(R.id.scrollView);
        imageView = (ImageView) findViewById(R.id.imageView);
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
        btn33 = (Button) findViewById(R.id.btn33);
        btn34 = (Button) findViewById(R.id.btn34);
        btn35 = (Button) findViewById(R.id.btn35);
        btn36 = (Button) findViewById(R.id.btn36);
        btn37 = (Button) findViewById(R.id.btn37);
        btn38 = (Button) findViewById(R.id.btn38);
        btn39 = (Button) findViewById(R.id.btn39);
        Button_start1 = (Button) findViewById(R.id.Button_start1);
        Button_start2 = (Button) findViewById(R.id.Button_start2);
        Button_start3 = (Button) findViewById(R.id.Button_start3);
        Button_start4 = (Button) findViewById(R.id.Button_start4);
        Button_start5 = (Button) findViewById(R.id.Button_start5);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView) findViewById(R.id.textView2);
        textView3 = (TextView) findViewById(R.id.textView3);
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
        btn33.setOnClickListener(this);
        btn34.setOnClickListener(this);
        btn35.setOnClickListener(this);
        btn36.setOnClickListener(this);
        btn37.setOnClickListener(this);
        btn38.setOnClickListener(this);
        btn39.setOnClickListener(this);
        Button_start1.setOnClickListener(this);
        Button_start2.setOnClickListener(this);
        Button_start3.setOnClickListener(this);
        Button_start4.setOnClickListener(this);
        Button_start5.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
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
            case R.id.btn33:
                btnclk = ' ';
                test();
                break;
            case R.id.btn34:
                btnclk = ',';
                test();
                break;
            case R.id.btn35:
                btnclk = '.';
                test();
                break;
            case R.id.btn36:
                btnclk = ':';
                test();
                break;
            case R.id.btn37:
                btnclk = '-';
                test();
                break;
            case R.id.btn38:
                btnclk = '?';
                test();
                break;
            case R.id.btn39:
                btnclk = '!';
                test();
                break;
            case R.id.Button_start1:
                n_str=0;
                arr = str[n_str].toCharArray();
                textView.setText(str[n_str]);
                Button_start1.setVisibility(View.INVISIBLE);
                Button_start2.setVisibility(View.INVISIBLE);
                Button_start3.setVisibility(View.INVISIBLE);
                Button_start4.setVisibility(View.INVISIBLE);
                Button_start5.setVisibility(View.INVISIBLE);
                btnstart = true;
                running = true;
                chektime();
                break;
            case R.id.Button_start2:
                n_str=1;
                arr = str[n_str].toCharArray();
                textView.setText(str[n_str]);
                Button_start1.setVisibility(View.INVISIBLE);
                Button_start2.setVisibility(View.INVISIBLE);
                Button_start3.setVisibility(View.INVISIBLE);
                Button_start4.setVisibility(View.INVISIBLE);
                Button_start5.setVisibility(View.INVISIBLE);
                btnstart = true;
                running = true;
                chektime();
                break;
            case R.id.Button_start3:
                n_str=2;
                arr = str[n_str].toCharArray();
                textView.setText(str[n_str]);
                Button_start1.setVisibility(View.INVISIBLE);
                Button_start2.setVisibility(View.INVISIBLE);
                Button_start3.setVisibility(View.INVISIBLE);
                Button_start4.setVisibility(View.INVISIBLE);
                Button_start5.setVisibility(View.INVISIBLE);
                btnstart = true;
                running = true;
                chektime();
                break;
            case R.id.Button_start4:
                n_str=3;
                arr = str[n_str].toCharArray();
                textView.setText(str[n_str]);
                Button_start1.setVisibility(View.INVISIBLE);
                Button_start2.setVisibility(View.INVISIBLE);
                Button_start3.setVisibility(View.INVISIBLE);
                Button_start4.setVisibility(View.INVISIBLE);
                Button_start5.setVisibility(View.INVISIBLE);
                btnstart = true;
                running = true;
                chektime();
                break;
            case R.id.Button_start5:
                n_str=4;
                arr = str[n_str].toCharArray();
                textView.setText(str[n_str]);
                Button_start1.setVisibility(View.INVISIBLE);
                Button_start2.setVisibility(View.INVISIBLE);
                Button_start3.setVisibility(View.INVISIBLE);
                Button_start4.setVisibility(View.INVISIBLE);
                Button_start5.setVisibility(View.INVISIBLE);
                btnstart = true;
                running = true;
                chektime();
                break;




        }
    }

    private void test() {
        if (btnstart) {
            if (i + 1 <= str[n_str].length()) {
                arr[i] = Character.toLowerCase(arr[i]);
                if (btnclk == arr[i]) {
                    Spannable text = new SpannableString(str[n_str]);
                    text.setSpan(new StyleSpan(Typeface.ITALIC), 0, a, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    text.setSpan(new ForegroundColorSpan(Color.GREEN), 0, a, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
                    speedw++;
                    if (btnclk == ' ') {
                        countworld++;

                    }
                    textView.setText(text);
                    i++;
                    a++;
                    countsymbol++;

                } else {
                    Toast toast = Toast.makeText(getApplicationContext(), "Введена неверная буква", Toast.LENGTH_SHORT);
                    toast.show();
                    Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
                    v.vibrate(100);
                    counterror++;
                speedw++;

                }

                if (counterror == 15) {
                    ll1.removeAllViews();
                    ll2.removeAllViews();
                    ll3.removeAllViews();
                    ll4.removeAllViews();
                    ll5.removeAllViews();
                    scr.removeAllViews();
                    imageView.setImageDrawable((getResources().getDrawable(R.drawable.wrong)));
                    textView3.setText("Кол-во слов - " + countworld+"\n" + "Кол-во символов - " + countsymbol+"\n" + "Кол-ва ошибок - " + counterror+"\n" + "Прошло времени - " + counttime);


                }

            }
        } else {
            Toast toast = Toast.makeText(getApplicationContext(), "Нажмите кнопку 'Старт'", Toast.LENGTH_SHORT);
            toast.show();
        }
    }

    private void chektime() {

        final Handler handler = new Handler();
        handler.post(new Runnable() {
            @Override
            public void run() {

                int hours = seconds / 3600;
                int minutes = (seconds % 3600) / 60;
                int secon = seconds % 60;
                final String time = String.format("%d:%02d:%02d", hours, minutes, secon);
                counttime=time;
                textView2.setText("Кол-во слов - " + countworld + " Кол-во символов - " + countsymbol + " Кол-ва ошибок - " + counterror + " Прошло времени - " + counttime + " Скорость набора - "+speed);
                if(running) {
                    seconds++;
                speed = (speedw*60)/seconds;
                }
                handler.postDelayed(this, 1000);



            }

        });
    }


}