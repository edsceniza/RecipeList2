package edna.ceniza.com.recipelist2

/**
 * Created by Edna Ceniza on 07/12/2017.
 */
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomAdapter(val recipeList: ArrayList<Food>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtName?.text = recipeList[position].name
        holder?.txtDesc?.text = recipeList[position].desc

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtName = itemView.findViewById<TextView>(R.id.txtName)
        val txtDesc = itemView.findViewById<TextView>(R.id.txtDesc)
    }
}