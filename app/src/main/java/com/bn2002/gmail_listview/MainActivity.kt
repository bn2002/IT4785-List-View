package com.bn2002.gmail_listview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.annotation.ColorInt

class MainActivity : AppCompatActivity() {
    lateinit var mails: ArrayList<MailModel>
    private lateinit var listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        listView = findViewById(R.id.mail_list_view)
        title = "Inbox"
        initMailData()

        val adapter = MailAdapter(this, mails)
        listView.adapter = adapter
    }

    private fun initMailData() {
        mails = ArrayList<MailModel>()
        mails += MailModel(title = "LottieFiles", content = "No matter what your choice of tool, we've got you covered. Updates specially for you! Designers, we've got your back.")
        mails += MailModel(title = "PHP Classes Newclas.", content = "File-sharing sites are helpful to allow users to send files that would be too large to share by other means, like, for instance, email messages or chat applications like Facebook Messenger, WhatsApp,")
        mails += MailModel(title = "Apple", content = "Xem công bố đặc biệt từ Apple.Đón xem sự kiện đặc biệt của Apple.")
        mails += MailModel(title = "Apple", content = "Xem công bố đặc biệt từ Apple.Đón xem sự kiện đặc biệt của Apple.")
        mails += MailModel(title = "Apple", content = "Xem công bố đặc biệt từ Apple.Đón xem sự kiện đặc biệt của Apple.")
        mails += MailModel(title = "Apple", content = "Xem công bố đặc biệt từ Apple.Đón xem sự kiện đặc biệt của Apple.")
        mails += MailModel(title = "Apple", content = "Xem công bố đặc biệt từ Apple.Đón xem sự kiện đặc biệt của Apple.")
        mails += MailModel(title = "Apple", content = "Xem công bố đặc biệt từ Apple.Đón xem sự kiện đặc biệt của Apple.")
    }
}