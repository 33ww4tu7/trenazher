package com.example.fando.trenazher;

        import android.app.Activity;
        import android.content.Intent;
        import android.os.Bundle;
        import android.view.Menu;
        import android.view.MenuItem;
        import android.view.View;
        import android.widget.TextView;




public class MainActivity extends Activity {
    TextView textView;
    private static final int IDM_PREF = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(textView4);
    }



    public void game1(View view) {
        Intent intent = new Intent(MainActivity.this, game1.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.add(0, IDM_PREF, 0, "Настройки");
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = new Intent();
        switch (item.getItemId()) {
            case IDM_PREF:
                intent.setClass(this, PreferencesActivity.class);
                startActivity(intent);
                break;
        }
    return true;
    }

    public void game2(View view) {
        Intent intent = new Intent(MainActivity.this, game2.class);
        startActivity(intent);
    }

    public void game3(View view) {
        Intent intent = new Intent(MainActivity.this, game3start.class);
        startActivity(intent);  }

    public void game4(View view) {
        Intent intent = new Intent(MainActivity.this, game4.class);
        startActivity(intent);  }
}



