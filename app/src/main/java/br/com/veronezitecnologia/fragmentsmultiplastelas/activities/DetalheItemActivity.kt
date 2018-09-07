package br.com.veronezitecnologia.fragmentsmultiplastelas.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.veronezitecnologia.fragmentsmultiplastelas.R
import br.com.veronezitecnologia.fragmentsmultiplastelas.fragments.DetalheItemFragment
import br.com.veronezitecnologia.fragmentsmultiplastelas.models.Item

class DetalheItemActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhe_item)

        val item = intent.getSerializableExtra("item") as Item
        if (savedInstanceState == null) {
            val detalheItemFragment = DetalheItemFragment.newInstance(item)
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.flDetailContainer, detalheItemFragment)
            ft.commit()
        }

    }
}
