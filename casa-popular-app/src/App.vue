<template>
  <div id="app">
    <v-content>
      <v-container
              class="fill-height"
              fluid>
        <router-view/>
      </v-container>
    </v-content>
  </div>
</template>

<style lang="scss">
  #app {
    font-family: Avenir, Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
  }
</style>
