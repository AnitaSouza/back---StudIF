<template>
  <div>
    <barraNav></barraNav>
    <b-container>
      <h1>Calendário</h1>
      <b-calendar class="calendario" block></b-calendar>

      <b-button class="addEvento">+ Adicionar Evento</b-button>
    </b-container>
  </div>
</template>

<script>
import barraNav from '~/components/barraNav.vue'
export default {
  components: { barraNav },
}
</script>

<style>
.calendario {
  display: inline-block;
  width: 50%;
  margin: 0 auto;
  margin-top: 30px;
}
h1 {
  text-align: center;
}
.addEvento {
  display: block;
  margin: 0 auto;
  margin-top: 30px;
}
</style>