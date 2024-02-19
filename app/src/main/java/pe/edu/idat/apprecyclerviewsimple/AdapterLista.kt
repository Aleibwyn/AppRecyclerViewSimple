package pe.edu.idat.apprecyclerviewsimple

import android.content.ClipData.Item
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import pe.edu.idat.apprecyclerviewsimple.databinding.ItemListaBinding

class AdapterLista(private var listItem: List<String>) : RecyclerView.Adapter<AdapterLista.ViewHolder>() {

    inner class ViewHolder(val binding: ItemListaBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemListaBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount() = listItem.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.tvNombre.text = listItem.get(position)
    }
}