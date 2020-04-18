import Vue from 'vue'
import VueRouter from 'vue-router'
import Cadastro from '../views/cadastro/Cadastro'
import Contemplados from '../views/contemplados/Contemplados'
import FamiliasAptas from '../views/familias-aptas/FamiliasAptas'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'FamiliasAptas',
    component: FamiliasAptas
  },
  {
    path: '/cadastro',
    name: 'Cadastro',
    component: Cadastro
  },
  {
    path: '/contemplados',
    name: 'Contemplados',
    component: Contemplados
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
