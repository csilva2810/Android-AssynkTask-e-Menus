package com.ocean.aluno.mtmenu;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.ocean.aluno.mtmenu.utils.Constantes;

public class HomeActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        switch (item.getItemId()) {
            case R.id.action_settings:

                openNewActivity(Constantes.KEY_OPCAO_SELECIONADA, "Clicou em " + item.getTitle() + "!");
                return true;

                // Toast.makeText(this, "Clicou em configurações", Toast.LENGTH_SHORT).show();
                // return true;
        }

        return super.onOptionsItemSelected(item);

    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (item.getItemId()) {
            case R.id.nav_camera:
                Intent i = new Intent(this, ImagemActivity.class);
                startActivity(i);
                // openNewActivity(Constantes.KEY_OPCAO_SELECIONADA, "Clicou em " + item.getTitle() + "!");
                return true;

            case R.id.nav_gallery:
                openNewActivity(Constantes.KEY_OPCAO_SELECIONADA, "Clicou em " + item.getTitle() + "!");
                return true;

            case R.id.nav_slideshow:
                openNewActivity(Constantes.KEY_OPCAO_SELECIONADA, "Clicou em " + item.getTitle() + "!");
                return true;

            case R.id.nav_manage:
                openNewActivity(Constantes.KEY_OPCAO_SELECIONADA, "Clicou em " + item.getTitle() + "!");
                return true;

            case R.id.nav_share:
                openNewActivity(Constantes.KEY_OPCAO_SELECIONADA, "Clicou em " + item.getTitle() + "!");
                return true;

            case R.id.nav_send:
                openNewActivity(Constantes.KEY_OPCAO_SELECIONADA, "Clicou em " + item.getTitle() + "!");
                return true;
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void openNewActivity(String extra, String extraValue) {

        Intent i = new Intent(this, NewActivity.class);
        i.putExtra(extra, extraValue);
        startActivity(i);

    }

}
