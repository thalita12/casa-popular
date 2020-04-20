<template>
  <div class="pagina-nao-ncontrada">
    <h1>Ops! Pagina não encontrada...</h1>
    <p>Por favor, volte para o <a :href="'/'">início</a></p>
  </div>
</template>

<script>
  export default {
    name: 'PaginaNaoEncontrada'
  }
</script>

<style scoped lang="scss">
  .pagina-nao-ncontrada h1 {
    font-size: 24px;margin-top: 50px;
  }
</style>