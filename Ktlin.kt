class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = findViewById(R.id.submit) as Button
        var log = findViewById(R.id.log) as TextView
        a.setOnClickListener {
            log.setText("Message")
        }
    }
}
/*
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = findViewById(R.id.submit) as Button
        var log = findViewById(R.id.log) as TextView
        a.setOnClickListener {
            log.setText("Message")
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 1001)
        }
    }
}











class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = findViewById(R.id.submit) as Button
        var log = findViewById(R.id.log) as TextView
        a.setOnClickListener {
            log.setText("Message")
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(intent, 1001)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == 1001) {
            // OK
        }
    }
}



val bitmap = data.extras.get("data") as Bitmap


imageView!!.setImageBitmap(bitmap)


*/
