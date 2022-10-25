<template>
  <div>
    <barraNav></barraNav>
    <b-container class="container">
      <img src="lampada.webp" width="320" height="205" />
      <center><p>Dica do dia</p></center>

      <b-container class="DicadoDia">
        <h1>{{ dica.nome }}</h1>
        <p id="id">O id da dica é: {{ dica.id }}</p>
        <p id="data">Data: {{ dica.data }}</p>
        <b-button class="button" v-on:click="deletar">Deletar</b-button>
        <p id="delete"></p>

        <b-container class="BancodeDicas">
          <center><p>Banco de Dicas</p></center>
        </b-container>
        <b-container class="AddDicas">
          <center><p>+ Adicionar Dicas</p></center>
        </b-container>
      </b-container>
    </b-container>
  </div>
</template>



<script>
import barraNav from '~/components/barraNav.vue'
export default {
  async asyncData({ $axios, route }) {
    const idDica = route.params
    const response = await $axios.get('/dicas/' + idDica)
    const dica = response.data
    return { dica }
  },
  methods: {
    deletar() {
      const id = this.$route.params
      this.$axios.delete('/dicas/' + id)
      const response = document.getElementById('delete')
      response.innerHTML =
        'Dica excluída.'
    },
  },
  components: { barraNav },
}
</script>

<style>
html,
body {
  height: 100%;
  width: 100%;
  background-color: rgb(255, 255, 255);
}
.container img {
  max-width: 200px;
  display: block;
  margin: 0 auto;
}
.DicadoDia,
.BancodeDicas,
.AddDicas {
  background-color: #c9e9af;
}
</style>
