<template>
  <div class="familias-aptas">
    <h1 class="familias-aptas__titulo">Famílias aptas para receberem a casa popular</h1>

    <v-data-table
            :headers="headers"
            :items="desserts"
            :items-per-page="5"
            class="elevation-1"/>
  </div>
</template>

<script>
  export default {
    name: 'FamiliasAptas',
    data () {
      return {
        headers: [
          {
            text: 'Pontuação',
            align: 'start',
            sortable: true,
            value: 'name'
          },
          { text: 'Família', value: 'calories' },
          { text: 'Renda Total', value: 'fat' }
        ],
        desserts: [
          {
            name: 'Frozen Yogurt',
            calories: 159,
            fat: 6.0
          },
          {
            name: 'Ice cream sandwich',
            calories: 237,
            fat: 9.0
          },
          {
            name: 'Eclair',
            calories: 262,
            fat: 16.0
          },
          {
            name: 'Cupcake',
            calories: 305,
            fat: 3.7
          },
          {
            name: 'Gingerbread',
            calories: 356,
            fat: 16.0
          },
          {
            name: 'Jelly bean',
            calories: 375,
            fat: 0.0
          },
          {
            name: 'Lollipop',
            calories: 392,
            fat: 0.2
          },
          {
            name: 'Honeycomb',
            calories: 408,
            fat: 3.2
          },
          {
            name: 'Donut',
            calories: 452,
            fat: 25.0
          },
          {
            name: 'KitKat',
            calories: 518,
            fat: 26.0
          }
        ]
      }
    }
  }
</script>

<style scoped lang="scss">
  .familias-aptas {
    width: 100%;
    margin: 30px 50px;

    &__titulo {
      font-size: 24px;
      margin-bottom: 20px;
    }
  }
</style>