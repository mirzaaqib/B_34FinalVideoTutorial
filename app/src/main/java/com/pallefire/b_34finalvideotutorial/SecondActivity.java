package com.pallefire.b_34finalvideotutorial;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.LinkedHashMap;

public class SecondActivity extends AppCompatActivity {

    TextView textView5;
    ListView listView2;
    //ArrayList<Details> arrayList2;
    LinkedHashMap<String, String> linkedhashMap1;
    MyAdapters myAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView5 = (TextView) findViewById(R.id.textView5);
        listView2 = (ListView) findViewById(R.id.listView2);
        //arrayList2 = new ArrayList<Details>();
        linkedhashMap1 = new LinkedHashMap<String, String>();
        myAdapter2 = new MyAdapters();
        listView2.setAdapter(myAdapter2);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String cname = bundle.getString("cnm");
        textView5.setText(cname);

        if(cname.equals("Csharp for freshers")) {
            linkedhashMap1.put("1.  C# program compilation \n18:47", "ltgDdukzQ7I");
            linkedhashMap1.put("2.  C# data type \n25:00", "phl_bKsL3U0");
            linkedhashMap1.put("3.  C# class  \n10:48","l1C4FZGCab0");
            linkedhashMap1.put("4.  C# class as virtual entity \n09:15", "HSdIq3k51bg");
            linkedhashMap1.put("5.  C# Objects in c# \n22:14", "SM_QqUdMXY0");
            linkedhashMap1.put("6.  C# Debugging in visual studio \n10:41", "8hXH5HxQfFU");
            linkedhashMap1.put("7.  C# Arrays \n24:50", "CLnA6OAlNPk");
            linkedhashMap1.put("8.  Declaring and Modifying data in c# arrays\n09:06", "O2QI3YFupxM");
            linkedhashMap1.put("9.  Arrays Assignment\n07:49", "Zt85ireWQWw");
            linkedhashMap1.put("10.  Loops\n05:51", "u_k75WcEpHM");
            linkedhashMap1.put("11.  For-Loops \n23:46", "isSp9xjw0LQ");
//            linkedhashMap1.put("12.  C# Strings \n21:02", "MGCZ8AHhwDA");
//            linkedhashMap1.put("14.  Constructors \n05:08", "5h8Tu68VXsI");
//            linkedhashMap1.put("15.  Problems When Constructor is Not Used \n19:41", "Yij6AUta4yI");
//            linkedhashMap1.put("16.  Constructors Example \n21:07", "Gr6qsjTIifA");
//            linkedhashMap1.put("17.  Inheritance \n09:24", "TOBLe0qoA_o");
//            linkedhashMap1.put("18.  Inheritance Part2 \n24:07", "T7G8NFXDXFE");
//            linkedhashMap1.put("19.  Base Keyword \n22:08", "WaAbIMz2dqg");
//            linkedhashMap1.put("20.  Overriding Intro \n23:31", "w6ldKhR4YUs");
//            linkedhashMap1.put("21.  overriding an override method \n12:52", "fdPslUmRqm0");
        }
        else if(cname.equals("Csharp for professionals")){
            linkedhashMap1.put("1.  C# program compilation \n18:47", "ltgDdukzQ7I");
            linkedhashMap1.put("2.  Debugging in visual studio \n10:41", "8hXH5HxQfFU");
            linkedhashMap1.put("3.  Inheritance \n09:24", "TOBLe0qoA_o");
            linkedhashMap1.put("4.  Inheritance part2 \n24:07", "T7G8NFXDXFE");
            linkedhashMap1.put("5.  Base Keyword \n22:08", "WaAbIMz2dqg");
            linkedhashMap1.put("6.  Overriding Intro \n23:31", "w6ldKhR4YUs");
            linkedhashMap1.put("7.  overriding an override method \n12:52", "fdPslUmRqm0");
            linkedhashMap1.put("8.  Static Variables\n09:21", "zvk_hS4vEOw");
            linkedhashMap1.put("9.  what is the use of properties in c#\n16:16", "UdiU6sp68Tc");
            linkedhashMap1.put("10.  C# Properties \n15:03", "5nHmt5Zi7l8");
//            linkedhashMap1.put("11.  C# Constants\n08:57", "9_fH7R6rPaU");
//            linkedhashMap1.put("12.  C# Constants part2 \n08:22", "Wn20d0KBk1o");
//            linkedhashMap1.put("13.  Read Only Variables \n09:27", "YfYkswfGo_k");
//            linkedhashMap1.put("14.  Params Keyword \n16:27", "wZ_bBpsd10o");
//            linkedhashMap1.put("15.  Exceptions \n17:16", "wBxVpzaTXkc");
//            linkedhashMap1.put("16.  Exception Handling Part 2 \n09:25", "mTF-ct2IkGU");
//            linkedhashMap1.put("17.  GC Terminology\n17:16", "eyytXkQqOV0");
        }
        else if(cname.equals("SQL for freshers")){
            linkedhashMap1.put("1.  sql server overview \n16:25", "Kdc84lpF4GM");
            linkedhashMap1.put("2.  Normalization \n14:30", "7Dc7_I48ZTg");
            linkedhashMap1.put("3.  Orderby clause \n6:59", "quuwLXzZl3g");
            linkedhashMap1.put("4.  Delete drop and truncate statements \n6:59", "yZNyUzSMsT8");
            linkedhashMap1.put("5.  Aggregate Functions \n13:54", "2IYykxAXaB8");
            linkedhashMap1.put("6.  Joins and Inner Join with explanation \n33:02", "i0vwTFFHTU8");
            linkedhashMap1.put("7.  Stored Procedure \n17:11", "jmZsXlAYe7Y");
            linkedhashMap1.put("7.  User Defined Functions in sql \n9:01", "8cJFtDESxiQ");
            linkedhashMap1.put("7.  Indexes \n9:09", "hrVpqW_Bh2o");
        }
//        else if(cname.equals("Java for professionals")){
//            linkedhashMap1.put("1.  Collections \n20:00", "SUtAfV2_3Kw");
//            linkedhashMap1.put("2.  Exceptions data type \n25:00", "phl_bKsL3U0");
//            linkedhashMap1.put("3.  Threads \n15:00", "9mdJV5-eias");
//        }
//        else if(cname.equals("Android for freshers")){
//            linkedhashMap1.put("1.  Activity Lifecycle \n20:00", "SUtAfV2_3Kw");
//            linkedhashMap1.put("2.  Layouts \n25:00", "phl_bKsL3U0");
//            linkedhashMap1.put("3.  Passing Data Between screens \n15:00", "9mdJV5-eias");
//        }
//        else if(cname.equals("Android for professionals")){
//            linkedhashMap1.put("1.  Adapters Introduction \n20:00", "SUtAfV2_3Kw");
//            linkedhashMap1.put("2.  ArrayAdapter  \n25:00", "phl_bKsL3U0");
//            linkedhashMap1.put("3.  CustomAdapter \n30:00", "9mdJV5-eias");
//        }

        myAdapter2.notifyDataSetChanged();
    }

    private class MyAdapters extends BaseAdapter{
        @Override
        public int getCount() {
            return linkedhashMap1.size();
        }

        @Override
        public Object getItem(int position) {
            return linkedhashMap1.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(final int position, View convertView, ViewGroup parent) {
            String topic = new ArrayList<String>(linkedhashMap1.keySet()).get(position);
            String vkey = new ArrayList<String>(linkedhashMap1.values()).get(position);

            View view2 = getLayoutInflater().inflate(R.layout.row_new, null);
            //TextView textView6 = (TextView) view2.findViewById(R.id.textView6);
            TextView textView7 = (TextView) view2.findViewById(R.id.textView7);
            //TextView textView8 = (TextView) view2.findViewById(R.id.textView8);
            Button button2 = (Button) view2.findViewById(R.id.button);
            //textView6.setText(topic);
            textView7.setText(topic);
            //textView8.setText(d.getCdur());
            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Details d = arrayList2.get(position);
                    String vkey = new ArrayList<String>(linkedhashMap1.values()).get(position);
                    Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                    intent.putExtra("vkey",vkey);
                    startActivity(intent);
                }
            });

            return view2;
        }
    }
}
