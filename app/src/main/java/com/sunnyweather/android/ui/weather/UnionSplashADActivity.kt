package com.sunnyweather.android.ui.weather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sunnyweather.android.R

class UnionSplashADActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_union_splash_a_d)
    }
}
//public class UnionSplashADActivity extends Activity implements UnionSplashAdListener {
//    private UnionSplashAD splashAD;
//
//    private boolean canJump = false;
//    private Handler handler = new Handler (Looper.getMainLooper());
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_splash);
//        hideSystemNavigationBar();
//        FrameLayout contentView = this.findViewById(R.id.splash_container);
//        splashAD = new UnionSplashAD (this, "您的appKey", "代码位", this, 0);
//        splashAD.fetchAndShowIn(contentView);
//    }
//    private void hideSystemNavigationBar() {
//        if (Build.VERSION.SDK_INT > 11 && Build.VERSION.SDK_INT < 19) {
//            View view = this.getWindow().getDecorView();
//            view.setSystemUiVisibility(View.GONE);
//        } else if (Build.VERSION.SDK_INT >= 19) {
//            View decorView = getWindow ().getDecorView();
//            int uiOptions = View . SYSTEM_UI_FLAG_HIDE_NAVIGATION
//            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
//            | View.SYSTEM_UI_FLAG_F ULLSCREEN;
//            decorView.setSystemUiVisibility(uiOptions);
//        }
//    }
//    @Override
//    public void onAdDismissed() {
//        Log.d("unions_ads", "点击了了跳转按钮");
//        this.finish();
//    }
//    @Override
//    public void onNoAd(AdError error) {    //此⽅方法主要是防⽌止在拉取开屏⼴广告时出错导致开屏⼀一闪⽽而过，开发者也可以根据⾃自⼰己的需求⾃自⼰己实现，不不 ⼀一定按照此⽅方式实现
//        handler.postDelayed(new Runnable () {
//            @Override
//            public void run() {
//                SplashActivity.this.finish();
//            }
//        }, 3000);
//        Log.d(
//            "unions_ads",
//            error.getErrorMsg() + "  " + error.getErrorCode()
//        );//具 体错误码参考在下⽅方            }
//        @Override
//        public void onAdPresent() {
//            Log.d("unions_ads", "广告展现了了");
//        }
//        @Override
//        public void onAdClicked() {
//            Log.d("unions_ads", "点击广告内容了了");
//        }
//
//        @Override
//        protected void onResume() {
//            super.onResume();
//            //此步骤主要是处理理点击⼴广告之后，退出当前的开屏⻚页⾯面，开发者可以根据⾃自⼰己的需求⾃自⼰己处理理，不不 ⼀一定按照此⽅方式处理理
//            if (canJump) {
//                this.finish();
//            }
//        }
//        @Override
//        protected void onPause() {
//            super.onPause();
//            canJump = true;
//        }
//        @Override
//        protected void onDestroy() {
//            super.onDestroy();
////清空Handler队列列中的所有消息，如果开发者在onNoAd()⽅方法中没有使⽤用Handler⽅方式处理理，可 以不不⽤用在此处添加这⾏行行代码
//            /handler.removeCallbacksAndMessages(null);
//        }
//    }
