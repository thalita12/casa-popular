import Vue from 'vue'
import VueRouter from 'vue-router'
import Cadastro from '../views/cadastro/Cadastro'
import Contemplados from '../views/contemplados/Contemplados'
import Resultado from '../views/resultado/Resultado'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'Resultado',
    component: Resultado
  },
  {
    path: '/cadastro/novo',
    name: 'Cadastro',
    component: Cadastro
  },
  {
    path: '/contemplados/listagem',
    name: 'Contemplados',
    component: Contemplados
  },
  {
    path: '/about',
    name: 'About',
    // route level code-splitting
    // this generates a separate chunk (about.[hash].js) for this route
    // which is lazy-loaded when the route is visited.
    component: () => import(/* webpackChunkName: "about" */ '../views/About.vue')
  }
]

const router = new VueRouter({
  mode: 'history',
  base: process.env.BASE_URL,
  routes
})

export default router
