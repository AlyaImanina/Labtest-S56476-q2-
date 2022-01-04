package com.example.labtestq2

import android.content.Context
import android.content.Intent
import android.database.Cursor
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.io.File

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



//        var entities = ArrayList<String>()
//        if(!dbExists(this, "mydata")){
//            createDB();
//        }
//        val db: SQLiteDatabase = openOrCreateDatabase("mydata", MODE_PRIVATE, null)
//        val sql = "SELECT username from user"
//        var c: Cursor = db.rawQuery(sql,null)
//        while (c.moveToNext()){
//            val username = c.getString(0)
//            entities.add(username)
//        }
//        c.close()

//        val myAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, entities)
//        val lv = findViewById<ListView>(R.id.lv)
//        lv.setAdapter(myAdapter)
//        lv.onItemClickListener = AdapterView.OnItemClickListener{ adapter, v, position, arg3 ->
//            val value = adapter.getItemAtPosition(position).toString()
//            val intent = Intent(this, ViewEntiti::class.java).apply {
//                putExtra("entiti", value.toString())
//            }
//            startActivity(intent)
//        }

//        val fab = findViewById<Button>(R.id.btnSubmit)
//        fab.setOnClickListener(){
//            val intent = Intent(this, MainActivity::class.java).apply {
//            }
//            startActivity(intent)
//        }
//    }
////
//
//    private fun dbExists(c: Context, dbName: String):Boolean{
//        val dbFile: File = c.getDatabasePath(dbName)
//        return dbFile.exists()
//    }
//
//    private fun createDB(){
//        val db = openOrCreateDatabase("mydata", MODE_PRIVATE, null)
//        subToast("Database mydata created")
//        val sqlText = "CREATE TABLE IF NOT EXISTS user" +
//                "(username VARCHAR(30) PRIMARY KEY, " +
//                "password VARCHAR(30) NOT NULL" +
//                ");"
//        subToast("Table user created")
//        db.execSQL(sqlText)
//        var nextSQL = "INSERT INTO user(username, password) VALUES ('ahmad', 'ahmad123');"
//        db.execSQL(nextSQL)
//
//        subToast("1 sample entities added!")
//    }
//    private fun subToast(msg: String){
//        Toast.makeText(this,msg, Toast.LENGTH_SHORT).show()
  }
    override fun onPause() {
        super.onPause()
        val iuser = findViewById<EditText>(R.id.inUsername)
        val ipass = findViewById<EditText>(R.id.inPass)

        val sp = this.getSharedPreferences("ahmad", MODE_PRIVATE)
        val editor = sp.edit()
        editor.putString("name", iuser.text.toString())
        editor.putString("age", ipass.text.toString())
        editor.commit()
    }
}