
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import IndexInfoManager from "./components/listers/IndexInfoCards"
import IndexInfoDetail from "./components/listers/IndexInfoDetail"

import StreamInfoManager from "./components/listers/StreamInfoCards"
import StreamInfoDetail from "./components/listers/StreamInfoDetail"

import FileManager from "./components/listers/FileCards"
import FileDetail from "./components/listers/FileDetail"




export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/indexInfos',
                name: 'IndexInfoManager',
                component: IndexInfoManager
            },
            {
                path: '/indexInfos/:id',
                name: 'IndexInfoDetail',
                component: IndexInfoDetail
            },

            {
                path: '/streamInfos',
                name: 'StreamInfoManager',
                component: StreamInfoManager
            },
            {
                path: '/streamInfos/:id',
                name: 'StreamInfoDetail',
                component: StreamInfoDetail
            },

            {
                path: '/files',
                name: 'FileManager',
                component: FileManager
            },
            {
                path: '/files/:id',
                name: 'FileDetail',
                component: FileDetail
            },





    ]
})
