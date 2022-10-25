<template>
  <body>
    <div class="login">
      <barraNav></barraNav>
      <center><h2>Log in</h2></center>
      <b-container>
        <b-form>
        <label> <h4>Nome</h4></label>
        <b-form-input type="text" v-model="form.nome" placeholder="Nome da dica"></b-form-input>
        <label> <h4>Dica</h4> </label>
        <b-form-input type="text" v-model="form.dica" placeholder="Texto da dica"></b-form-input>
        <label> <h4>Data</h4> </label>
        <b-form-input type="text" v-model="form.data" placeholder="dd/mm/aaaa"></b-form-input>
        <!-- <NuxtLink to="/tela-calendario"
          ></NuxtLink -->
          <b-button class="botão" type="submit" v-on:click="cadastrar"> login </b-button>
          </b-form>
      </b-container>
    </div>
  </body>
</template>

<script>
import barraNav from '~/components/barraNav.vue'
export default {
  name: 'IndexPage',
  components: { barraNav },
  data() {
    return {
      form: {
        nome: '',
        dica: '',
        data: '',
      },
      show: true,
    }
  },
   methods: {
    onSubmit(event) {
      event.preventDefault()
      alert(JSON.stringify(this.form))
    },
    cadastrar() {
      this.$axios.post('/dicas', {
        nome: this.form.nome,
        dica: this.form.dica,
        data: this.form.data,
      })
      this.$router.push('/lista-dicas')
    },
  },
}
</script>
<style>
body {
  /* background: rgb(255,255,255); */
  background: linear-gradient(
    180deg,
    rgba(255, 255, 255, 1) 0%,
    rgba(204, 255, 164, 1) 35%,
    rgba(159, 214, 117, 1) 100%
  );
  background-repeat: no-repeat;
  height: 120vh;
}

.botão {
  width: 15%;
  right: 20%;
  background-color: #589b23;
  border-color: black;
  border-radius: 40px;
  margin: 0 auto;
  color: rgb(0, 0, 0);
  display: block;
  padding: 10px;
  margin-top: 20px;
}
</style>
