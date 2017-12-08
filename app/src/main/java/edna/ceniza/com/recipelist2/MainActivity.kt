package edna.ceniza.com.recipelist2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.recyclerView)
        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val food = ArrayList<Food>()
        food.add(Food("Spicy turkey sweet potatoes",
                "Transform turkey thigh mince into a low-fat, low-calorie, chilli-style filling for soft, creamy baked sweet potatoes",
                R.drawable.food1,
                "4 sweet potatoes\n" +
                        "1 tbsp olive oil\n" +
                        "1 onion\n" +
                        ", finely chopped\n" +
                        "1 garlic clove, crushed\n" +
                        "500g pack turkey thigh mince\n" +
                        "500g carton passata\n" +
                        "3 tbsp barbecue sauce\n" +
                        "½ tsp cayenne pepper\n" +
                        "4 tbsp soured cream\n" +
                        "½ pack chives, finely snipped",
                "1. Heat oven to 200C/180C fan/gas 6. Prick the potatoes, place on a baking tray and bake for 45 mins or until really soft.\n" +
                        "2. Meanwhile, heat the oil in a frying pan, add the onion and cook gently for 8 mins until softened. Stir in the garlic, then tip in the mince and stir to break up. Cook over a high heat until any liquid has evaporated and the mince is browned, about 10 mins. Pour in the passata, then fill the carton a quarter full of water and tip that in too. Add the barbecue sauce and cayenne, then lower the heat and simmer gently for 15 mins, adding a little extra water if needed. Taste and season.\n" +
                        "3. When the potatoes are soft, split them down the centre and spoon the mince over the top. Add a dollop of soured cream and a sprinkling of chives."))
        food.add(Food("Pork tenderloin with chipotle sauce & pickled red onions",
                "The ultimate Friday night food, these smoky flavoured wraps will bring the taste of Mexico to your table",
                R.drawable.food2,
                "2 red onions, one thickly and one thinly sliced\n" +
                        "juice 2 limes\n" +
                        "2 tsp dried oregano\n" +
                        "8 fat garlic cloves, unpeeled\n" +
                        "6 medium plum tomatoes, halved\n" +
                        "2 tbsp chipotle paste (we used Discovery, available from Waitrose)\n" +
                        "2 tbsp chilli powder\n" +
                        "3 tbsp soft brown sugar\n" +
                        "2 pork tenderloins, about 500g each\n" +
                        "coriander sprigs and warm soft tortillas (flour or corn), to serve",
                "1. Place the thinly sliced onion in a bowl with juice 1 lime, half the oregano and a pinch each of salt and pepper. Set aside.\n" +
                        "2. Dry-fry the whole garlic in a non-stick pan until blackened on both sides, about 8 mins, then peel. Heat the grill. Arrange the thickly sliced onion on a baking tray with the tomatoes, cut-side up. Season and grill until blackened, about 8 mins. Tip into a bowl with the garlic, chipotle paste, 1 tsp chilli powder, 1 tbsp sugar and remaining lime juice. Season and whizz in a blender until smooth. Gently heat through in a pan.\n" +
                        "3. Rub the pork with the remaining chilli powder, oregano, sugar and seasoning. Grill for 5 mins each side until cooked. Serve sliced in warm tortillas with some sauce, the pickled onions and coriander."))
        food.add(Food("Bone broth",
                "Packed with nutrients for healthy bones, hair and nails, this soup is made with selenium and zinc-rich chicken bones and antioxidant-rich coriander",
                 R.drawable.food3,
                "1 meaty chicken\n" +
                        " carcass, plus any jellified roasting juices from it, skin and fat discarded\n" +
                        "1 large onion\n" +
                        ", halved and sliced\n" +
                        "zest and juice 1 lemon\n" +
                        "2 bay leaves\n" +
                        "1-2 red chillies, halved, deseeded and sliced\n" +
                        "1 tsp ground coriander\n" +
                        "½ tsp ground cumin\n" +
                        "small pack coriander, stems and leaves chopped and separated\n" +
                        "1 large garlic clove, finely grated\n" +
                        "Optional topping\n" +
                        "250g pouch wholegrain basmati rice",
                "1. Break the chicken carcass into a large pan and add the onion, 1.5 litres of water, the lemon juice and bay leaves. Cover and simmer for 40 mins. Remove from the heat and allow to cool slightly, to make things a bit easier to handle.\n" +
                        "2. Place a colander over a bowl and scoop out all the bones into the colander. Pick through them, stripping off the chicken and returning it with any onion as you work your way down the pile of bones.\n" +
                        "3. Return any broth from the bowl to the pan – and any jellified roasting juices – along with the chilli, ground coriander, cumin, coriander stems, lemon zest and garlic. Cook for a few mins until just bubbling – don’t overboil as you will spoil the delicate flavours. Taste, and season only if you need to. Meanwhile, heat the rice following pack instructions, then toss with the coriander leaves. Ladle the broth into bowls and top with the rice."))
        food.add(Food("Mozzarella stuffed crust pizza",
                "Create your own cheesy masterpiece at home with our mozzarella pizza that goes the extra mile. You can't beat an oozy stuffed crust",
                R.drawable.food4,
                "200ml milk\n" +
                        "300g strong white bread flour\n" +
                        "1 tsp fast-action dried yeast\n" +
                        "½ tsp golden caster sugar, plus a pinch\n" +
                        "3 tbsp olive oil\n" +
                        ", plus a drizzle\n" +
                        "250ml passata\n" +
                        "2 garlic cloves, squashed\n" +
                        "½ tsp dried oregano\n" +
                        "1-2 tbsp polenta\n" +
                        "250g grated mozzarella\n" +
                        "toppings of your choice, we used pepperoni slices, chopped chorizo and basil",
                "1. You can make the pizza dough up to 48 hrs before you want to cook the pizza. Warm the milk in a saucepan until steaming but not boiling. In a large bowl combine the flour, yeast, sugar and 1 tsp salt. Add 1/2 tbsp oil to the milk and leave to cool until just warm –when you place a finger in the liquid it should feel body temperature. Pour the liquid into the bowl and either mix with a wooden spoon or food mixer, until the ingredients are well combined. Tip out onto your work surface and knead for 10 mins, or continue mixing in the mixer for 5-7 mins, until you have a smooth and elastic dough. Clean and oil the bowl, return the dough and cover with cling film. Leave somewhere warm to rise for 1-2 hrs, until doubled in size, or place in the fridge for up to 48 hrs.\n" +
                        "2. Meanwhile, make the sauce. Pour the remaining oil and passata into a saucepan and add the squashed garlic, oregano and a pinch of sugar. Season well and simmer for 5-10 mins, until the sauce is thick. Remove the garlic cloves and set aside until you’re ready to assemble the pizza.\n" +
                        "3. If the dough has been chilled remove from the fridge and leave at room temperature for 1 hr. Dust the work surface with polenta and tip the dough onto it. Punch the dough down to knock out the air bubbles then shape into a disk. Roll out the dough to a pizza base, about 35cm wide. Dust a large baking sheet with polenta and place the dough on top, making sure the dough can move around freely. Use 125g of the mozzarella to create a ring around the outside edge of the pizza base, leaving 1/2cm gap between the edge. Brush a little water inside the mozzarella ring then fold over the outside edge to enclose the mozzarella and create a stuffed crust. Press firmly to stick the dough in place.\n" +
                        "4. Spoon the sauce over the middle of the base and top with the remaining mozzarella. Scatter with your chosen toppings (save any fresh herbs for scattering over at the end) and brush the stuffed crust with a little oil, then lightly cover with oiled cling film and set aside for 20-30 mins, until the dough has puffed up a little. Meanwhile heat oven to 240C/220C fan/gas 9 with a large baking sheet on the middle shelf to heat up.\n" +
                        "5. When the oven is hot and the pizza dough has puffed up, quickly open the oven door and slide the pizza onto the hot tray. Shut the door and cook for 15-20 mins, or until bubbling and cooked through. Leave to cool for a few mins before eating."))

        val adapter = CustomAdapter(food)
        rv.adapter = adapter
    }
}
