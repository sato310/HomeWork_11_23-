package com.sato310.homework_11_23;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// 天気予報（電話）
		Button button1 = (Button)findViewById(R.id.button);
		button1.setOnClickListener(this);

		// メール送信
		Button button2 = (Button)findViewById(R.id.button1);
		button2.setOnClickListener(this);
		
		// 博多駅（地図）
		Button button3 = (Button)findViewById(R.id.button2);
		button3.setOnClickListener(this);
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.button:
			// アクションを指定  ACTION_CALL（電話をかける）
			Intent intent1 = new Intent(Intent.ACTION_CALL,Uri.parse("tel:177"));
			// 電話番号の指定
			
			startActivity(intent1);
			break;
			
		case R.id.button1:
			Intent intent2 = new Intent();  
			  
			// アクションを指定  ACTION_SENDTO:メールを送る
			intent2.setAction(Intent.ACTION_SENDTO);  
			// データを指定  
			intent2.setData(Uri.parse("mailto:akira000041@gmail.com"));  
			  
			// 件名を指定  
			intent2.putExtra(Intent.EXTRA_SUBJECT, "Intentだよ");  
			// 本文を指定  
			intent2.putExtra(Intent.EXTRA_TEXT, "Intentだよ");  
			  
			// Intentを発行  
			startActivity(intent2);
			break;
			
		case R.id.button2:
			Intent intent3 = new Intent(this, MapActivity.class);
			startActivity(intent3);
			break;
		}
	}


}
