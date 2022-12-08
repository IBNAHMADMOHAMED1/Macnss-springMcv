<%--
  Created by IntelliJ IDEA.
  User: Youcode
  Date: 05/12/2022
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to our service - Macnss</title>
    <script src="https://cdn.tailwindcss.com"></script>
    <script defer src="https://unpkg.com/alpinejs@3.x.x/dist/cdn.min.js"></script>

</head>
<body x-data="{ open: false }">
<header aria-label="Site Header" class="bg-white">
    <div class="mx-auto max-w-screen-xl px-4 sm:px-6 lg:px-8">
        <div class="flex h-16 items-center justify-between">
            <div class="flex-1 md:flex md:items-center md:gap-12">
                <a class="block text-teal-600" href="/">
                    <span class="sr-only">Home</span>
                    <img class="h-10" src="https://www.maroc.ma/sites/default/files/styles/thumbnail_detail_mobile/public/image_service_electronique/cnss_1.png?itok=ANPWvcTv" *>
                    </svg>
                </a>
            </div>

            <div class="md:flex md:items-center md:gap-12">
                <div class="flex items-center gap-4">
                    <div class="sm:flex sm:gap-4">
                        <a
                                class="rounded-md bg-blue-800 px-8 py-2.5 text-sm font-medium text-white shadow"
                                href="/"
                        >
                            Logout
                        </a>
                    </div>

                    <div class="block md:hidden">
                        <button
                                class="rounded bg-gray-100 p-2 text-gray-600 transition hover:text-gray-600/75"
                        >
                            <svg
                                    xmlns="http://www.w3.org/2000/svg"
                                    class="h-5 w-5"
                                    fill="none"
                                    viewBox="0 0 24 24"
                                    stroke="currentColor"
                                    stroke-width="2"
                            >
                                <path
                                        stroke-linecap="round"
                                        stroke-linejoin="round"
                                        d="M4 6h16M4 12h16M4 18h16"
                                />
                            </svg>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</header>


<div class="text-sm w-1/3 font-medium  text-center text-gray-500 border-b border-gray-200 m-auto">
    <ul class="flex flex-wrap -mb-px">
        <li class="mr-2">
      <span  class="inline-block cursor-pointer p-4 rounded-t-lg border-b-2 border-transparent hover:text-gray-500 hover:border-gray-300 "
             :class="open ? '' : 'p-4 text-blue-600 rounded-t-lg border-b-2 border-blue-500 '"
             x-on:click="open=false" >Traiter Dossier</span>
        </li>
        <li class="mr-2">
      <span class="inline-block cursor-pointer p-4 rounded-t-lg border-b-2 border-transparent hover:text-gray-500 hover:border-gray-300 "
            :class="!open ? '' : 'p-4 text-blue-600 rounded-t-lg border-b-2 border-blue-500 '" aria-current="page"
            x-on:click="open=true">Chat</span>
        </li>
    </ul>
</div>


</body>
</html>
