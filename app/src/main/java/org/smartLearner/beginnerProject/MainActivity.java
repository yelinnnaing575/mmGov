/*
   လောလောဆယ် Activity များစွာဖြင့် intent ကူး၍ ပြခိုင်းထားသည်
   fragment webview ဖြင့် ပြနိုင်ဖို့ ပြင်ချင်သေးသည်
   
   ယခု App ၏ ရည်ရွယ်ချက်က အစိုးရဝက်ဆိုက်များအား အလွယ်တကူ ဝင်ရောက်ကြည်ရှုနိုင်ရန်ဖြစ်သည်
   ဒီအတွက် လွယ်ကူ အဆင်ပြေဆံုး သပ်ရပ်ကျစ်လစ်သည့် code များဖြစ်စေရန်
   သင့်စိတ်ကူးရှိသလို ပြင်ဆင်နိုင်သည် 
*/
package org.smartLearner.beginnerProject;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.view.View.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    public void k1(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
        Intent in=new Intent(MainActivity.this, m1.class);
        startActivity(in);
        }
    public void k2(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m2.class);
            startActivity(in);
        }
    public void k3(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m3.class);
            startActivity(in);
        }
    public void k4(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m4.class);
            startActivity(in);
        }
    public void k5(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m5.class);
            startActivity(in);
        }
    public void k6(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m6.class);
            startActivity(in);
        }
    public void k7(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m7.class);
            startActivity(in);
        }
    public void k8(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m8.class);
            startActivity(in);
        }
    public void k9(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m9.class);
            startActivity(in);
        }
    public void k10(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m10.class);
            startActivity(in);
        }
    public void k11(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m11.class);
            startActivity(in);
        }
    public void k12(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m12.class);
            startActivity(in);
        }
    public void k13(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m13.class);
            startActivity(in);
        }
    public void k14(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m14.class);
            startActivity(in);
        }
    public void k15(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m15.class);
            startActivity(in);
        }
    public void k16(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m16.class);
            startActivity(in);
        }
    public void k17(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m17.class);
            startActivity(in);
        }
    public void k18(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m18.class);
            startActivity(in);
        }
    public void k19(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m19.class);
            startActivity(in);
        }
    public void k20(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m20.class);
            startActivity(in);
        }
    public void k21(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m21.class);
            startActivity(in);
        }
    public void k22(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m22.class);
            startActivity(in);
        }
    public void k23(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m23.class);
            startActivity(in);
        }
    public void k24(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m24.class);
            startActivity(in);
        }
    public void k25(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m25.class);
            startActivity(in);
        }
    public void k26(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m26.class);
            startActivity(in);
        }
    public void k27(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m27.class);
            startActivity(in);
        }
    public void k28(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m28.class);
            startActivity(in);
        }
    public void k29(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m29.class);
            startActivity(in);
        }
    public void k30(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m30.class);
            startActivity(in);
        }
    public void k31(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m31.class);
            startActivity(in);
        }
    public void k32(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m32.class);
            startActivity(in);
        }
    public void k33(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m33.class);
            startActivity(in);
        }
    public void k34(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m34.class);
            startActivity(in);
        }
    public void k35(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m35.class);
            startActivity(in);
        }
    public void k36(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m36.class);
            startActivity(in);
        }
    public void k37(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m37.class);
            startActivity(in);
        }
    public void k38(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m38.class);
            startActivity(in);
        }
    public void k39(View v) {
            Toast.makeText(getApplication(),"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ",5000).show();
            Intent in=new Intent(MainActivity.this, m39.class);
            startActivity(in);
        }
}

