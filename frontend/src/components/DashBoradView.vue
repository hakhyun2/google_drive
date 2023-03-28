<template>

    <v-data-table
        :headers="headers"
        :items="dashBorad"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DashBoradView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "fileName", value: "fileName" },
                { text: "fileSize", value: "fileSize" },
                { text: "fileType", value: "fileType" },
                { text: "indexYn", value: "indexYn" },
                { text: "uploadYn", value: "uploadYn" },
                { text: "videoFileUrl", value: "videoFileUrl" },
            ],
            dashBorad : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/dashBorads'))

            temp.data._embedded.dashBorads.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.dashBorad = temp.data._embedded.dashBorads;
        },
        methods: {
        }
    }
</script>

