package com.application.vietlotteryfourteen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var exit = 0

    private var btn1 : TextView? = null
    private var btn2 : TextView? = null
    private var btn3 : TextView? = null
    private var btn4 : TextView? = null
    private var btn5 : TextView? = null
    private var btn6 : TextView? = null
    private var btnP : TextView? = null
    private var nxt : ImageView? = null
    //actionbar
    private  lateinit var myWaysList: ArrayList<MyWays>
    private lateinit var myAdapter: MyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //init actionbar
        loadCards()
        //add page change listener
        viewPager.addOnPageChangeListener(object: ViewPager.OnPageChangeListener{
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
                //change title of actionbar
                var title = myWaysList[position].title
            }
            override fun onPageSelected(position: Int) {
            }
            override fun onPageScrollStateChanged(state: Int) {
            }
        })
        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.type1))
        }
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.type2))
        }
        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.type3))
        }
        btn4 = findViewById(R.id.btn4)
        btn4?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.type4))
        }
        btn5 = findViewById(R.id.btn5)
        btn5?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.type5))
        }
        btn6 = findViewById(R.id.btn6)
        btn6?.setOnClickListener{
            Navigator.showContent(this, getString(R.string.type6))
        }
        nxt = findViewById(R.id.nxt)
        nxt?.setOnClickListener{
            val intent = Intent(this, PageAbout::class.java)
        startActivity(intent)
        }
        btnP = findViewById(R.id.btnP)
        btnP?.setOnClickListener{
            val intent = Intent(this, PolicyAndTerms::class.java)
            startActivity(intent)
        }
    }
    private fun loadCards(){
        myWaysList = ArrayList()

        myWaysList.add(MyWays(
            "Sử dụng Numerology",
            R.string.ways1,
            R.drawable.banner14
        ))
        myWaysList.add(MyWays(
            "Nghiên cứu số liệu thống kê",
            R.string.ways2,
            R.drawable.banner14
        ))
        myWaysList.add(MyWays(
            "Đi số ngẫu nhiên",
            R.string.ways3,
            R.drawable.banner14
        ))
        myWaysList.add(MyWays(
            "Sử dụng các con số may mắn",
            R.string.ways4,
            R.drawable.banner14
        ))
        myWaysList.add(MyWays(
            "Tạo một khuôn mẫu khi chọn số",
            R.string.ways5,
            R.drawable.banner14
        ))
        myWaysList.add(MyWays(
            "Chọn số trên 31",
            R.string.ways6,
            R.drawable.banner14
        ))
        myWaysList.add(MyWays(
            "Để nó cho máy",
            R.string.ways7,
            R.drawable.banner14
        ))
        myWaysList.add(MyWays(
            "Sử dụng một hệ thống",
            R.string.ways8,
            R.drawable.banner14
        ))
        myAdapter = MyAdapter(this, myWaysList)
        viewPager.adapter = myAdapter
        viewPager.setPadding(50,0,50,0)
    }
    override fun onBackPressed() {
        if (exit == 0) {
            exit = 1
            Toast.makeText(this, "NHẤP VÀO LẠI ĐỂ Thoát", Toast.LENGTH_SHORT).show()
        }else{
            super.finishAffinity()
        }
    }
}