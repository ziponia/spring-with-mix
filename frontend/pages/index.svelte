<script lang="ts">
    import {link} from "svelte-spa-router";
    import Layout from '../common/layout.svelte'
</script>

<Layout>
    <h1>hello world</h1>
    <a href="/about" use:link>about!</a>
</Layout>
