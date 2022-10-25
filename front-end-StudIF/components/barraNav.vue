<template>
  <div id="barra">
    <img src="../static/menu.png" id="menu" v-on:click="verMenu" />
    <b-container id="barra-menu">
      <img src="../static/menu.png" id="menu" v-on:click="verMenu" />
      <NuxtLink to="/tela-calendario">Calendário</NuxtLink>
      <NuxtLink to="/lista-dicas">Lista Dicas</NuxtLink>
    </b-container>
  </div>
</template>

<script>
export default {
  methods: {
    verMenu() {
      const barraMenu = document.getElementById('barra-menu')
      const menu = document.getElementById('menu')

      if (barraMenu.style.display === 'block') {
        barraMenu.style.display = 'none'
        menu.style.display = 'block'
      } else {
        barraMenu.style.display = 'block'
        menu.style.display = 'none'
      }
    },
  },
}
</script>

<style>
#barra {
  background-color: #589b23;
  height: 50px;
  width: 100%;
  left: 0;
}
#menu {
  padding-left: 0;
  height: 25px;
  width: 25px;
  margin-left: 10px;
  margin-top: 10px;
  cursor: pointer;
}
#barra-menu {
  background-color: #589b23;
  display: none;
  height: 100%;
  width: 20%;
  z-index: 4;
  position: fixed;
}
</style>
