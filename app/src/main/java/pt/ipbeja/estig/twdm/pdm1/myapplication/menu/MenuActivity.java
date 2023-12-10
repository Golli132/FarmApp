package pt.ipbeja.estig.twdm.pdm1.myapplication.menu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import pt.ipbeja.estig.twdm.pdm1.myapplication.R;
import pt.ipbeja.estig.twdm.pdm1.myapplication.databinding.ActivityMenuBinding;
import pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments.BackpackFragment;
import pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments.ExtrasFragment;
import pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments.FieldsFragment;
import pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments.HomeFragment;
import pt.ipbeja.estig.twdm.pdm1.myapplication.menu.fragments.ShopFragment;

public class MenuActivity extends AppCompatActivity {
    private ActivityMenuBinding binding;
    private final BackpackFragment backpackFragment = BackpackFragment.newInstance();
    private final FieldsFragment fieldsFragment =  FieldsFragment.newInstance();
    private final HomeFragment homeFragment =  HomeFragment.newInstance();
    private final ShopFragment shopFragment =  ShopFragment.newInstance();
    private final ExtrasFragment extrasFragment =  ExtrasFragment.newInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMenuBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bottomNavigationView.setOnNavigationItemSelectedListener(menuItem -> {
            switch (menuItem.getItemId()) {
                case R.id.backpack: {

                }
                case R.id.fields: {

                }
                case R.id.home: {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, homeFragment)
                            .commit();

                }
                case R.id.shop: {

                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, shopFragment)
                            .commit();
                }
                case R.id.extras: {
                    getSupportFragmentManager().beginTransaction()
                            .replace(R.id.fragment_container, extrasFragment)
                            .commit();
                    return true;
                }
            }
            return false;
        });

        binding.bottomNavigationView.setSelectedItemId(R.id.home);
    }
}