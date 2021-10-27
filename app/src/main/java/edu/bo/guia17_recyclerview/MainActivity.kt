package edu.bo.guia17_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lista = arrayListOf<Usuario>()
        lista.add(Usuario("Antonio Medina Padilla", "toomedinaamp2010@gmail.com"))
        lista.add(Usuario("Albert Medina Padilla", "albertMedina@gmail.com"))

        val userListAdapter = UserListAdapter(lista, this)
        recyclerView.adapter = userListAdapter

        val linearLayoutManager = LinearLayoutManager(this)
        linearLayoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = linearLayoutManager

    }
}