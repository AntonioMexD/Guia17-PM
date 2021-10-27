package edu.bo.guia17_recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_user.view.*

class UserListAdapter(val items: ArrayList<Usuario>, val context: Context):
    RecyclerView.Adapter<UserListAdapter.UserListViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserListViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_user, parent, false)
        return UserListViewHolder(v)
    }

    override fun onBindViewHolder(holder: UserListViewHolder, position: Int) {
        val usuario = items.get(position)
        holder.itemView.txt_nombre.text = usuario.nombre
        holder.itemView.txt_email.text = usuario.correo
    }

    override fun getItemCount(): Int {
        return items.count()
    }

    class UserListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}
