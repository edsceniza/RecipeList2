package edna.ceniza.com.recipelist2

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView
import edna.ceniza.com.recipelist2.R
import edna.ceniza.com.recipelist2.Food
import org.w3c.dom.Text
@Suppress("DEPRECATION")
/**
 * Created by Edna Ceniza on 08/12/2017.
 */
class Recipe  : AppCompatActivity(){
    companion object {
        val KEY_RECIPE = "123"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fullrecipe_layout)



        val recipe: Food = intent.getParcelableExtra(KEY_RECIPE)

        val txtIngred = findViewById<TextView>(R.id.txtIngred) as TextView
        val txtProced = findViewById<TextView>(R.id.txtProced) as TextView
        val imgPic = findViewById<ImageView>(R.id.imageView) as ImageView
        txtIngred.append(recipe.ingred)
        txtProced.append(recipe.proced)
        val drawable: Drawable = resources.getDrawable(recipe.img)
        imgPic.setImageDrawable(drawable)

        val toolbar = findViewById<Toolbar>(R.id.toolbar) as Toolbar
        toolbar.setTitleTextColor(Color.WHITE)
        toolbar.setBackgroundColor(Color.BLACK)
        toolbar.setSubtitleTextColor(Color.GRAY)
        toolbar.setSubtitle(recipe.name)

        setSupportActionBar(toolbar)
        if (getSupportActionBar() != null){
            getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
            getSupportActionBar()?.setDisplayShowHomeEnabled(true)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            finish()
        }

        return super.onOptionsItemSelected(item)
    }
}