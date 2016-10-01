package com.coursera.sacbe.petagramaxelsegura.restApi;

/**
 * Created by axel on 30/09/2016.
 */
public final class ConstantesRestApi {

    //https://api.instagram.com/v1/
    public static final String INICIO_QUERY_STRING = "?";
    public static final String APPEND_QUERY_STRING = "&";
    public static final String VERSION = "/v1/";
    public static final String ROOT_URL = "https://api.instagram.com" + VERSION;
    public static final String ACCESS_TOKEN = "3978956593.bb1703f.56b842ce54bc4e34a5417f8bc900f6d3";
    public static final String KEY_ACCESS_TOKEN = "access_token=";
    public static final String KEY_GET_RECENT_MEDIA_USER = "users/self/media/recent/";
    //https://api.instagram.com/v1/users/self/media/recent/?access_token=ACCESS-TOKEN
    public static final String URL_GET_RECENT_MEDIA_USER = KEY_GET_RECENT_MEDIA_USER + INICIO_QUERY_STRING + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    //Para buscar un usuario
    //https://api.instagram.com/v1/users/search?q=jack&access_token=ACCESS-TOKEN
    public static final String KEY_GET_USER_SEARCH = "users/search";
    //public static final String KEY_USER_SEARCH = INICIO_QUERY_STRING + "q={user-name}";
    public static final String URL_SEARCH_USER_BY_NAME = KEY_GET_USER_SEARCH + INICIO_QUERY_STRING + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

    //Para traer las fotos más recientes de un usuario a aprtir de su ID
    //https://api.instagram.com/v1/users/{user-id}/media/recent/?access_token=ACCESS-TOKEN
    public static final String KEY_GET_RECENT_MEDIA_USER_ID = "users/{user-id}/media/recent/";
    public static final String URL_GET_RECENT_MEDIA_USER_ID = KEY_GET_RECENT_MEDIA_USER_ID + INICIO_QUERY_STRING + KEY_ACCESS_TOKEN + ACCESS_TOKEN;

}
