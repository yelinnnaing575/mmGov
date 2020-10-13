/*
   လောလောဆယ် Activity နှစ်စံုဖြင့် intent ကူးကာ
   bundle ဖြင့် data ပြခိုင်းထားသည်
   
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
        Spinner spinner;
        String[] bankNames={"",""};
    
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
       
     }
       /* 
        spinner=(Spinner)findViewById(R.id.spinner1);
       
        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(),android.R.layout.simple_spinner_item,bankNames);
                 
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); 
        
        spinner.setAdapter(arrayAdapter);
        
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
        {
                                  
            @Override
               public void onItemSelected(AdapterView<?> parent, View view, int position, long id)
               {                
                   Toast.makeText(getApplicationContext(), bankNames[position], Toast.LENGTH_LONG).show();
               }
            @Override
               public void onNothingSelected(AdapterView<?> parent){}     });
       }
        
         စဉ် အမည်    Website လိပ်စာ
         ၁   နိုင်ငံတော်သမ္မတရုံး    www.president-office.gov.mm
         ၂   ကာကွယ်ရေးဝန်ကြီးဌာန www.mod.gov.mm
         ၃   နယ်စပ်ရေးရာဝန်ကြီးဌာန   www.mba.gov.mm
         ၄   ပြန်ကြားရေးဝန်ကြီးဌာန   www.moi.gov.mm
         ၅   နိုင်ငံခြားရေးဝန်ကြီးဌာန    
         ၆   သာသနာရေးဝန်ကြီးဌာန  
         ၇   သမဝါယမဝန်ကြီးဌာန    
         ၈   လယ်ယာစိုက်ပျိုးရေးနှင့်ဆည်မြောင်းဝန်ကြီးဌာန 
         ၉   မွေးမြူရေးနှင့်ရေလုပ်ငန်းဝန်ကြီးဌာန 
         ၁၀  ဆက်သွယ်ရေးနှင့် သတင်းအချက်အလက်နည်းပညာဝန်ကြီးဌာန 
         ၁၁  ပို့ဆောင်ရေးဝန်ကြီးဌာန  
         ၁၂  ပတ်ဝန်းကျင်ထိန်းသိမ်းရေးနှင့်သစ်တောရေးရာဝန်ကြီးဌာန  
         ၁၃  လူဝင်မှုကြီးကြပ်ရေးနှင့်ပြည်သူ့အင်အားဝန်ကြီးဌာန 
         ၁၄  စွမ်းအင်ဝန်ကြီးဌာန  
         ၁၅  စက်မှုဝန်ကြီးဌာန    
         ၁၆  စီးပွားရေးနှင့်ကူးသန်းရောင်းဝယ်ရေးဝန်ကြီးဌာန    
         ၁၇  လျှပ်စစ်စွမ်းအားဝန်ကြီးဌာန  
         ၁၈  အားကစားဝန်ကြီးဌာန   
         ၁၉  ပညာရေးဝန်ကြီးဌာန    
         ၂၀  ကျန်းမာရေးဝန်ကြီးဌာန    
         ၂၁  သတ္တုတွင်းဝန်ကြီးဌာန    
         ၂၂  အလုပ်သမား၊အလုပ်အကိုင်နှင့်လူမှုဖူလုံရေးဝန်ကြီးဌာန   
         ၂၃  ရထားပို့ဆောင်ရေးဝန်ကြီးဌာန  
         ၂၄  လူမှုဝန်ထမ်း၊ကယ်ဆယ်ရေးနှင့်ပြန်လည်နေရာချထားရေးဝန်ကြီးဌာန    
         ၂၅  ဟိုတယ်နှင့်ခရီးသွားလာရေးဝန်ကြီးဌာန  
         ၂၆  ယဉ်ကျေးမှုဝန်ကြီးဌာန    
         ၂၇  ဘဏ္ဍာရေးနှင့်အခွန်ဝန်ကြီးဌာန    
         ၂၈  အမျိုးသားစီမံကိန်းနှင့်စီးပွားရေးဖွံ့ဖြိုးတိုးတက်မှုဝန်ကြီးဌာန  
         ၂၉  ဆောက်လုပ်ရေးဝန်ကြီးဌာန  
         ၃၀  သိပ္ပံနှင့်နည်းပညာဝန်ကြီးဌာန    
         ၃၁  ပြည်ထောင်စုရှေ့နေချုပ်ရုံး  
         ၃၂  ပြည်ထောင်စုစာရင်းစစ်ချုပ်ရုံး   
         ၃၃  ပြည်ထောင်စုရာထူးဝန်အဖွဲ့    
         ၃၄  မြန်မာနိုင်ငံရဲတပ်ဖွဲ့  
         ၃၅  မီးသတ်ဦးစီးဌာန  
         ၃၆  ဘေးအန္တရာယ်ဆိုင်ရာစီမံခန့်ခွဲမှုဦးစီးဌာန    
         ၃၇  မြန်မာ့နိုင်ငံခြားကုန်သွယ်ရေးဘဏ်    
         ၃၈  ပြည်တွင်းအခွန်များဦးစီးဌာန  
         ၃၉ အကောက်ခွန်ဦးစီးဌာန  
         *//*
        public void webViewSwitch(TextView tv,View v)
            {
                int id=tv.getId();
                switch(id)
                {
                    case R.id.website1: setWebSite("http://www.president-office.gov.mm");   break;
                    case R.id.website2: setWebSite("http://www.mod.gov.mm");   break;
                    case R.id.website3: setWebSite("http://www.mba.gov.mm");   break;
                    case R.id.website4: setWebSite("http://www.moi.gov.mm");   break;
                    case R.id.website5: setWebSite("http://www.mofa.gov.mm");   break;
                    case R.id.website6: setWebSite("http://www.mora.gov.mm");   break;
                    case R.id.website7: setWebSite("http://www.myancoop.gov.mm");   break;
                    case R.id.website8: setWebSite("http://www.moai.gov.mm");   break;
                    case R.id.website9: setWebSite("http://www.livestock-fisheries.gov.mm");   break;
                    case R.id.website10: setWebSite("http://www.mcpt.gov.mm");   break;
                    case R.id.website11: setWebSite("http://www.mot.gov.mm");   break;
                    case R.id.website12: setWebSite("http://www.moecaf.gov.mm");   break;
                    case R.id.website13: setWebSite("http://www.mip.gov.mm");   break;
                    case R.id.website14: setWebSite("http://www.energy.gov.mm");   break;
                    case R.id.website15: setWebSite("http://www.moin.gov.mm");   break;
                    case R.id.website16: setWebSite("http://www.commerce.gov.mm");   break;
                    case R.id.website17: setWebSite("http://www.moep.gov.mm");   break;
                    case R.id.website18: setWebSite("http://www.myasoc.org");   break;
                    case R.id.website19: setWebSite("http://www.myanmar-education.edu.mm");   break;
                    case R.id.website20: setWebSite("http://www.moh.gov.mm");   break;
                    case R.id.website21: setWebSite("http://www.mining.gov.mm");   break;
                    case R.id.website22: setWebSite("http://www.mol.gov.mm");   break;
                    case R.id.website23: setWebSite("http://www.ministryofrailtransportation.com");   break;
                    case R.id.website24: setWebSite("http://www.mswrr.gov.mm");   break;
                    case R.id.website25: setWebSite("http://www.myanmartourism.org");   break;
                    case R.id.website26: setWebSite("http://www.culturemyanmar.org");   break;
                    case R.id.website27: setWebSite("http://www.mofra.gov.mm");   break;
                    case R.id.website28: setWebSite("http://www.mnped.gov.mm");   break;
                    case R.id.website29: setWebSite("http://www.ministryofconstruction.gov.mm");   break;
                    case R.id.website30: setWebSite("http://www.most.gov.mm");   break;
                    case R.id.website31: setWebSite("http://www.oag.gov.mm");   break;
                    case R.id.website32: setWebSite("http://www.oagmac.gov.mm");   break;
                    case R.id.website33: setWebSite("http://www.ucsb.gov.mm");   break;
                    case R.id.website34: setWebSite("http://www.myanmarpoliceforce.org");   break;
                    case R.id.website35: setWebSite("http://www.fsd.gov.mm");   break;
                    case R.id.website36: setWebSite("http://http://www.ddm.gov.mm");   break;
                    case R.id.website37: setWebSite("http://www.mmftb.gov.mm");   break;
                    case R.id.website38: setWebSite("http://www.ird.gov.mm");   break;
                    case R.id.website39: setWebSite("http://www.customs.gov.mm");   break;
                }
            }
    */
    
    
    public void k1(View v) { setWebSite("http://www.president-office.gov.mm");   }
        public void k2(View v) { setWebSite("http://www.mod.gov.mm");   }
        public void k3(View v) { setWebSite("http://www.mba.gov.mm");   }
        public void k4(View v) { setWebSite("http://www.moi.gov.mm");   }
        public void k5(View v) { setWebSite("http://www.mofa.gov.mm");   }
        public void k6(View v) { setWebSite("http://www.mora.gov.mm");   }
        public void k7(View v) { setWebSite("http://www.myancoop.gov.mm");   }
        public void k8(View v) { setWebSite("http://www.moai.gov.mm");   }
        public void k9(View v) { setWebSite("http://www.livestock-fisheries.gov.mm");   }
        public void k10(View v) { setWebSite("http://www.mcpt.gov.mm");   }
        public void k11(View v) { setWebSite("http://www.mot.gov.mm");   }
        public void k12(View v) { setWebSite("http://www.moecaf.gov.mm");   }
        public void k13(View v) { setWebSite("http://www.mip.gov.mm");   }
        public void k14(View v) { setWebSite("http://www.energy.gov.mm");   }
        public void k15(View v) { setWebSite("http://www.moin.gov.mm");   }
        public void k16(View v) { setWebSite("http://www.commerce.gov.mm");   }
        public void k17(View v) { setWebSite("http://www.moep.gov.mm");   }
        public void k18(View v) { setWebSite("http://www.myasoc.org");   }
        public void k19(View v) { setWebSite("http://www.moh.gov.mm");   }
        public void k20(View v) { setWebSite("http://www.mining.gov.mm");   }
        public void k21(View v) { setWebSite("http://www.mol.gov.mm");   }
        public void k22(View v) { setWebSite("http://www.ministryofrailtransportation.com");   }
        public void k23(View v) { setWebSite("http://www.mswrr.gov.mm");   }
        public void k24(View v) { setWebSite("http://www.myanmartourism.org");   }
        public void k25(View v) { setWebSite("http://www.culturemyanmar.org");   }
        public void k26(View v) { setWebSite("http://www.mofra.gov.mm");   }
        public void k27(View v) { setWebSite("http://www.mnped.gov.mm");   }
        public void k28(View v) { setWebSite("http://www.ministryofconstruction.gov.mm");   }
        public void k29(View v) { setWebSite("http://www.most.gov.mm");   }
        public void k30(View v) { setWebSite("http://www.oag.gov.mm");   }
        public void k31(View v) { setWebSite("http://www.oagmac.gov.mm");   }
        public void k32(View v) { setWebSite("http://www.ucsb.gov.mm");   }
        public void k33(View v) { setWebSite("http://www.myanmarpoliceforce.org");   }
        public void k34(View v) { setWebSite("http://www.fsd.gov.mm");   }
        public void k35(View v) { setWebSite("http://www.president-office.gov.mm");   }
        public void k36(View v) { setWebSite("http://www.ddm.gov.mm");   }
        public void k37(View v) { setWebSite("http://www.mmftb.gov.mm");   }
        public void k38(View v) { setWebSite("http://www.ird.gov.mm");   }
        public void k39(View v) { setWebSite("http://www.customs.gov.mm");   }
        
     
        Bundle bun=new Bundle();
    public void setWebSite(String a) 
    {
            String message = a+"/n"+"websiteသို့ သွားရောက်နေပါသဖြင့် ကျေးဇူးပြု၍ ခေတ္တစောင့်ဆိုင်းပေးပါ";
                
                Toast.makeText(getApplication(),message,500).show();/*
                Intent in=new Intent(MainActivity.this, webViewActivity.class);
                bun.putString("webUrl",a);
                in.putExtras(bun);
                startActivity(in);*/
    }     
}

