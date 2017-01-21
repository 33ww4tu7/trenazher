package com.example.fando.trenazher;


import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout;


public class game3main extends Activity implements OnTouchListener {

    private View selected_item = null;
    private int offset_x = 0;
    private int offset_y = 0;
    Boolean touchFlag = false;
    boolean dropFlag = false;
    LayoutParams imageParams;
    ImageView imageDrop1,imageDrop2,imageDrop3,imageDrop4,imageDrop5, imageDrop6, image1, image2;
    int eX, eY;
    int leftX1, rightX1, bottomY1,topY1, leftX2, rightX2, bottomY2,topY2, leftX3, rightX3, bottomY3,topY3, leftX4, rightX4, bottomY4,topY4,topY5, leftX5, rightX5, bottomY5,topY6, leftX6, rightX6, bottomY6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_game3main);
        View root = findViewById(android.R.id.content).getRootView();
        imageDrop1 = (ImageView) findViewById(R.id.imd1);
        imageDrop2 = (ImageView) findViewById(R.id.imd2);
        imageDrop3 = (ImageView) findViewById(R.id.imd3);
        imageDrop4 = (ImageView) findViewById(R.id.imd4);
        imageDrop5 = (ImageView) findViewById(R.id.imd5);
        imageDrop6 = (ImageView) findViewById(R.id.imd6);
        image1 = (ImageView) findViewById(R.id.img);
        image2 = (ImageView) findViewById(R.id.img2);
        image1.setOnTouchListener(this);
        image2.setOnTouchListener(this);
        root.setOnTouchListener(new View.OnTouchListener() {
            public boolean onTouch(View v, MotionEvent event) {
                if (touchFlag) {
                    System.err.println("Display If  Part ::->" + touchFlag);
                    switch (event.getActionMasked()) {
                        case MotionEvent.ACTION_DOWN:
                            topY1 = imageDrop1.getTop();
                            leftX1 = imageDrop1.getLeft();
                            rightX1 = imageDrop1.getRight();
                            bottomY1 = imageDrop1.getBottom();
                            topY2 = imageDrop2.getTop();
                            leftX2 = imageDrop2.getLeft();
                            rightX2 = imageDrop2.getRight();
                            bottomY2 = imageDrop2.getBottom();
                            topY3 = imageDrop3.getTop();
                            leftX3 = imageDrop3.getLeft();
                            rightX3 = imageDrop3.getRight();
                            bottomY3 = imageDrop3.getBottom();
                            topY4 = imageDrop4.getTop();
                            leftX4 = imageDrop4.getLeft();
                            rightX4 = imageDrop4.getRight();
                            bottomY4 = imageDrop4.getBottom();
                            topY5 = imageDrop5.getTop();
                            leftX5 = imageDrop5.getLeft();
                            rightX5 = imageDrop5.getRight();
                            bottomY5 = imageDrop5.getBottom();
                            topY6 = imageDrop6.getTop();
                            leftX6 = imageDrop6.getLeft();
                            rightX6 = imageDrop6.getRight();
                            bottomY6 = imageDrop6.getBottom();
                            break;
                        case MotionEvent.ACTION_MOVE:
                            eX = (int) event.getX();
                            eY = (int) event.getY();
                            int x = (int) event.getX() - offset_x;
                            int y = (int) event.getY() - offset_y;
                            int w = getWindowManager().getDefaultDisplay().getWidth() - 50;
                            int h = getWindowManager().getDefaultDisplay().getHeight() - 10;
                            if (x > w) x = w;
                            if (y > h) y = h;
                            RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(new ViewGroup.MarginLayoutParams(RelativeLayout.LayoutParams.WRAP_CONTENT, RelativeLayout.LayoutParams.WRAP_CONTENT));


                            lp.setMargins(x, y, 0, 0);

                            selected_item.setLayoutParams(lp);
                            break;
                        case MotionEvent.ACTION_UP:
                            touchFlag = false;

                            if (eX > leftX1 && eX < rightX1 && eY > topY1 && eY < bottomY1) {
                                imageDrop1.setBackgroundColor(Color.RED);
                                selected_item.bringToFront();
                                dropFlag = true;
                            } else {
                                imageDrop1.setBackgroundColor(Color.BLUE);
                            }  if (eX > leftX2 && eX < rightX2 && eY > topY2 && eY < bottomY2) {
                            imageDrop2.setBackgroundColor(Color.RED);
                            selected_item.bringToFront();
                            dropFlag = true;
                        } else {
                            imageDrop2.setBackgroundColor(Color.BLUE);
                        }  if (eX > leftX3 && eX < rightX3 && eY > topY3 && eY < bottomY3) {
                            imageDrop3.setBackgroundColor(Color.RED);
                            selected_item.bringToFront();
                            dropFlag = true;
                        } else {
                            imageDrop3.setBackgroundColor(Color.BLUE);
                        }  if (eX > leftX4 && eX < rightX4 && eY > topY4 && eY < bottomY4) {
                            imageDrop4.setBackgroundColor(Color.RED);
                            selected_item.bringToFront();
                            dropFlag = true;
                        } else {
                            imageDrop4.setBackgroundColor(Color.BLUE);
                        }  if (eX > leftX5 && eX < rightX5 && eY > topY5 && eY < bottomY5) {
                            imageDrop5.setBackgroundColor(Color.RED);
                            selected_item.bringToFront();
                            dropFlag = true;
                        } else {
                            imageDrop5.setBackgroundColor(Color.BLUE);
                        }  if (eX > leftX6 && eX < rightX6 && eY > topY6 && eY < bottomY6) {
                            imageDrop6.setBackgroundColor(Color.RED);
                            selected_item.bringToFront();
                            dropFlag = true;
                        } else {
                            imageDrop6.setBackgroundColor(Color.BLUE);
                        }




                            if (dropFlag) {
                                dropFlag = false;
                            } else {
                                selected_item.setLayoutParams(imageParams);
                            }
                            break;
                        default:
                            break;
                    }
                }
                return true;
            }
        });
    }

    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getActionMasked()) {
            case MotionEvent.ACTION_DOWN:
                touchFlag = true;
                offset_x = (int) event.getX();
                offset_y = (int) event.getY();
                selected_item = v;
                imageParams = v.getLayoutParams();
                break;
            case MotionEvent.ACTION_UP:
                selected_item = null;
                touchFlag = false;
                break;
            default:
                break;
        }
        return false;
    }
}
