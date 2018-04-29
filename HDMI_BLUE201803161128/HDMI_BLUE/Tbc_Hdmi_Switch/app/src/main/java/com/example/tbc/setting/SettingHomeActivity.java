package com.example.tbc.setting;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tbc.R;
import com.example.tbc.page.videoout.PageVideoOutInfo;
import com.example.tbc.protocal.TB3531;
import com.example.tbc.setting.system.ActivityCollector;
import com.example.tbc.setting.system.BaseActivity;
import com.example.tbc.setting.system.SettingSystemActivity;


public class SettingHomeActivity extends BaseActivity implements View.OnClickListener{

    public final static String TAG = "SettingHome";
    public final static String selectedButtonColor = "#87CEFA";
    //选中button，0是没有选择，1是已经有选中的
    public static int buttonSelected = 0;
    //定义18个按钮
    Button button1;
    Button button2;
    Button button3;
    Button button4;

    Button button5;
    Button button6;
    Button button7;
    Button button8;

    Button button9;
    Button button10;
    Button button11;
    Button button12;

    Button button13;
    Button button14;
    Button button15;
    Button button_star;
    Button button17;
    Button button_end;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_home);

        //取出每个按钮，记住不同的颜色
        button1 = (Button) findViewById(R.id.button_scene1);
        button2 = (Button) findViewById(R.id.button_scene2);
        button3 = (Button) findViewById(R.id.button_scene3);
        button4 = (Button) findViewById(R.id.button_scene4);
        button5 = (Button) findViewById(R.id.button_scene5);

        button6 = (Button) findViewById(R.id.button_scene6);
        button7 = (Button) findViewById(R.id.button_scene7);
        button8 = (Button) findViewById(R.id.button_scene8);
        button9 = (Button) findViewById(R.id.button_scene9);
        button10 = (Button) findViewById(R.id.button_scene10);

        button11 = (Button) findViewById(R.id.button_scene11);
        button12 = (Button) findViewById(R.id.button_scene12);
        button13 = (Button) findViewById(R.id.button_scene13);
        button14 = (Button) findViewById(R.id.button_scene14);
        button15 = (Button) findViewById(R.id.button_scene15);

        button_star = (Button) findViewById(R.id.button_scene16);
        button17 = (Button) findViewById(R.id.button_scene17);
        button_end = (Button) findViewById(R.id.button_scene18);

        readSelected();

    }

//    @Override
//    public void onBackPressed() {
//        super.onBackPressed();
//        //finish();
//       // ActivityCollector.finishAll();
//        //android.os.Process.killProcess(android.os.Process.myPid());
//    }

    void goToOtherPage(Class<?> cls){
        Intent intent = new Intent();
        intent.setClass(SettingHomeActivity.this, cls);
        startActivity(intent);
    }

    //根据index的值来确定要改变按个button的颜色
    protected void buttonColorGray(int index)
    {
        Drawable drawable = button_star.getBackground();
        switch (index)
        {
            case 1:
            {
                button1.setBackground(drawable);
                break;
            }
            case 2:
            {
                button2.setBackground(drawable);
                break;
            }
            case 3:
            {
                button3.setBackground(drawable);
                break;
            }
            case 4:
            {
                button4.setBackground(drawable);
                break;
            }
            case 5:
            {
                button5.setBackground(drawable);
                break;
            }
            case 6:
            {
                button6.setBackground(drawable);
                break;
            }
            case 7:
            {
                button7.setBackground(drawable);
                break;
            }
            case 8:
            {
                button8.setBackground(drawable);
                break;
            }
            case 9:
            {
                button9.setBackground(drawable);
                break;
            }
            case 10:
            {
                button10.setBackground(drawable);
                break;
            }
            case 11:
            {
                button11.setBackground(drawable);
                break;
            }
            case 12:
            {
                button12.setBackground(drawable);
                break;
            }
            case 13:
            {
                button13.setBackground(drawable);
                break;
            }
            case 14:
            {
                button14.setBackground(drawable);
                break;
            }
            case 15:
            {
                button15.setBackground(drawable);
                break;
            }
            case 17:
            {
                button17.setBackground(drawable);
                break;
            }
            case 18:
            {
                button_end.setBackground(drawable);
                break;
            }
            default:
                break;
        }
    }

    protected void saveSelected(int index)
    {
        SharedPreferences.Editor editor = getSharedPreferences("data",MODE_PRIVATE).edit();
        editor.putInt("selected",index);
        editor.apply();
    }

    protected void readSelected()
    {
        SharedPreferences pref = getSharedPreferences("data",MODE_PRIVATE);
        int index = pref.getInt("selected",0);
        if (0 == index)
        {
            return;
        }
        else
        {
            buttonSelected = index;//修改bug多个选中情况
            switch (index)
            {
                case 1:
                {
                    button1.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 2:
                {
                    button2.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 3:
                {
                    button3.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 4:
                {
                    button4.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 5:
                {
                    button5.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 6:
                {
                    button6.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 7:
                {
                    button7.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 8:
                {
                    button8.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 9:
                {
                    button9.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 10:
                {
                    button10.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 11:
                {
                    button11.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 12:
                {
                    button12.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 13:
                {
                    button13.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 14:
                {
                    button14.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 15:
                {
                    button15.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 17:
                {
                    button17.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                case 18:
                {
                    button_end.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    break;
                }
                default:
                    break;
            }
        }
    }

    //给设备发送切换指令
    public void sendCommandToClient(int index)
    {
        //根据按钮的index，发指令
        int flag = 0;
        if (17 == index || 18 == index)
        {
            index--;
        }
        int senceIndex = index + 48;

        Byte[] param = new Byte[2];

        param[0] = ((byte)(senceIndex >>8));
        param[1] = ((byte)(senceIndex & 0xff));
      //  param[2] = ((byte)(senceIndex >>8));
       // param[3] = ((byte)(senceIndex & 0xff));

        //先蓝牙发送数据,参数在param 中存储，4个字节 EVENT_SCENE_ID_SET -- EVENT_SCENE_ID_TAKE
       // TB3531.writeToSwitch(param);
        TB3531.writeAsync(TB3531.EVENT_SCENE_ID_SET,
                TB3531.EVENT_SCENE_ID_TAKE,param);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_scene1:
            {
                if (0 == buttonSelected)
                {
                    button1.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 1;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button1.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 1;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene2:
            {
                if (0 == buttonSelected)
                {
                    button2.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 2;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button2.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 2;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene3:
            {
                if (0 == buttonSelected)
                {
                    button3.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 3;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button3.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 3;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene4:
            {
                if (0 == buttonSelected)
                {
                    button4.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 4;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button4.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 4;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene5:
            {
                if (0 == buttonSelected)
                {
                    button5.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 5;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button5.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 5;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene6:
            {
                if (0 == buttonSelected)
                {
                    button6.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 6;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button6.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 6;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene7:
            {
                if (0 == buttonSelected)
                {
                    button7.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 7;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button7.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 7;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene8:
            {
                if (0 == buttonSelected)
                {
                    button8.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 8;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button8.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 8;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene9:
            {
                if (0 == buttonSelected)
                {
                    button9.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 9;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button9.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 9;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene10:
            {
                if (0 == buttonSelected)
                {
                    button10.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 10;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button10.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 10;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene11:
            {
                if (0 == buttonSelected)
                {
                    button11.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 11;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button11.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 11;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene12:
            {
                if (0 == buttonSelected)
                {
                    button12.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 12;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button12.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 12;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene13:
            {
                if (0 == buttonSelected)
                {
                    button13.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 13;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button13.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 13;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene14:
            {
                if (0 == buttonSelected)
                {
                    button14.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 14;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button14.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 14;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene15:
            {
                if (0 == buttonSelected)
                {
                    button15.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 15;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button15.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 15;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene17:
            {
                if (0 == buttonSelected)
                {
                    button17.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 17;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button17.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 17;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            case R.id.button_scene18:
            {
                if (0 == buttonSelected)
                {
                    button_end.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 18;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                else
                {
                    buttonColorGray(buttonSelected);
                    button_end.setBackgroundColor(Color.parseColor(selectedButtonColor));
                    buttonSelected = 18;
                    saveSelected(buttonSelected);
                    sendCommandToClient(buttonSelected);
                }
                break;
            }
            default:
                break;
        }
    }
}


