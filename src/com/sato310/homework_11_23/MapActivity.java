package com.sato310.homework_11_23;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

public class MapActivity extends FragmentActivity {
	
	// 初期座標を設定（博多駅）
	private static final LatLng START_POS = new LatLng(
			33.590002, 130.42062199999998);
	// 地図
	private GoogleMap map;
	// カメラ
	private CameraUpdate camera;
	// マーカーを設置する設定
	private MarkerOptions markers;
	
	@Override
	protected void onCreate(Bundle bundle) {
		super.onCreate(bundle);
		setContentView(R.layout.activity_map);
		// レイアウトへの設定
		final FragmentManager manager = getSupportFragmentManager();
		final SupportMapFragment frag = (SupportMapFragment) manager.findFragmentById(R.id.map);
		map = frag.getMap();
		
		// カメラ位置の設定
		final CameraPosition position = new CameraPosition(START_POS, 15, 0, 0);
		camera = CameraUpdateFactory.newCameraPosition(position);
		map.moveCamera(camera);
		// マーカーの設定
		markers = new MarkerOptions();
		markers.position(START_POS);
		map.addMarker(markers);
	}

}
