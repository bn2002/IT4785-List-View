package com.bn2002.gmail_listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MailAdapter(private val context: Context, private val mails: ArrayList<MailModel>): BaseAdapter() {

    private val inflater: LayoutInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
    override fun getCount(): Int {
        return mails.size
    }

    override fun getItem(position: Int): Any {
        return mails[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val rowView = inflater.inflate(R.layout.mail_list_item, parent, false)
        val fromTextView = rowView.findViewById(R.id.text_from) as TextView
        val subtitleTextView = rowView.findViewById(R.id.text_mail_content) as TextView

        val mail = getItem(position) as MailModel
        fromTextView.text = mail.title
        subtitleTextView.text = mail.content

        return rowView
    }


}