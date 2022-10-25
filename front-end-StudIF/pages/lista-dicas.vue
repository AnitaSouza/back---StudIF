<template>
  <div class="page-holder bg-gray-100 mt-5">
    <b-container class="bv-example-row">
      <h1>Lista de Dicas</h1>

      <div :key="dica.id" v-for="dica in dicas">
        <ItemListaDicas :idDica="dica.id" :dica="dica.nome">
        </ItemListaDicas>
      </div>
    </b-container>
    <div class="text-center"></div>
  </div>
</template>

<script>
import ItemListaDicas from '~/components/ItemListaDicas.vue'
export default {
  data() {
    return {
      dicas: [],
      dados: '',
    }
  },
  async mounted() {
    const response = await this.$axios.get('/dicas')
    this.dicas = response.data
  },
  components: { ItemListaDicas },
}
</script>


<style>
*{
  color: black;
}
</style>